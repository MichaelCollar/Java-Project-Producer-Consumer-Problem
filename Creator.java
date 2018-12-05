import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;


public class Creator extends Thread {

	private Products products;

	// Constructor.
	public Creator(Products products) {
		this.products = products;
	}

	@Override
	public void run() {
		try {
			// Reads the file specified by filename and returns the content as a List<String>.
			List<String> list = Files.newBufferedReader(Paths.get("../Products.txt")).lines().collect(Collectors.toList());
			// Number of Product objects that are already created.
			int numberOfProducts = 0;
			// Sets the values of idTowar and weight.
			for (String line : list) {
				String[] productsArray = line.trim().split("\\s+");
				int productId = Integer.parseInt(productsArray[0]);
				double productWeight = Double.parseDouble(productsArray[1]);
				// Creates a new Product object.
				Product product = new Product(productId, productWeight);
				numberOfProducts++;
				// Prints the number of created Product objects (every two hundred objects).
				if (numberOfProducts % 200 == 0) {
					System.out.println("created " + numberOfProducts + " objects");
				}
				products.setProductToCount(product);
			}
			products.setProductToCount(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
