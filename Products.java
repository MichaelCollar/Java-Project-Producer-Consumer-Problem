public class Products {

	private Product product;
	private boolean isNewReady;

	// @return a Product object that is ready to be counted.
	synchronized Product getTowarToCount() {
		try {
			while (!isNewReady) {
				try {
					wait();
				} catch (InterruptedException exc) {
				}
			}
			return product;
		} finally {
			isNewReady = false;
			notifyAll();
		}
	}

	// Sets a Product object as ready to be counted after it has been created.
	synchronized void setProductToCount(Product newProduct) {
		while (isNewReady) {
			try {
				wait();
			} catch (InterruptedException ie) {
			}
		}
		product = newProduct;
		isNewReady = true;
		notifyAll();
	}

}
