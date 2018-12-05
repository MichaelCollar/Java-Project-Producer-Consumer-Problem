import java.text.DecimalFormat;


public class WeightCounter extends Thread {

	private Products products;

	// Constructor.
	public WeightCounter(Products towary) {
		this.products = towary;
	}

	@Override
	public void run() {
		// A Product object whose weight has to be counted.
		Product product = products.getTowarToCount();
		// Number of Product objects that are already counted.
		int numberOfCountedTowar = 1;
		// The total weight of Product objects that are already counted.
		double totalWeight = 0;
		// Counts the weight of Product objects.
		while (product != null) {
			totalWeight += product.getWeight();
			// Prints the total weight (every hundred objects).
			if (numberOfCountedTowar % 100 == 0) {
				System.out.format("the weight of %d products was calculated\n", numberOfCountedTowar);
			}
			numberOfCountedTowar += 1;
			product = products.getTowarToCount();
		}
		// Prints the total weight of all Product objects.
		System.out.println(new DecimalFormat("0.##").format(totalWeight) + " kilograms");
	}
}
