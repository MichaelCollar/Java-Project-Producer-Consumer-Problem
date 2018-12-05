public class Main {

  public static void main(String[] args) {
		Products products = new Products();
		Thread creator = new Creator(products);
		Thread weightCounter = new WeightCounter(products);
		creator.start();
		weightCounter.start();
  }
}
