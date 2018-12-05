public class Product {
	private int productId;
	private double productWeight;

	/**
	 * Constructor:
     * @param productId	product id,
     * @param productWeight	product weight.
     */
	public Product(int productId, double productWeight) {
		this.productId = productId;
		this.productWeight = productWeight;
	}

	// @return product weight.
	public double getWeight() {
		return productWeight;
	}

	// @return product id.
	public int getId() {
		return productId;
	}

}
