package ua.hillel.lesson9;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ProductCreationTest {
  public void productCreationTest() {
    Product product = new Product();
    product.id = "1";
    product.name = "note";
    product.price = 1499.99;

    createProduct(product);
  }


  private void createProduct(Product product) {

  }


  public static class Product {
    private String id;
    String name;
    String desc;
    String category;
    double price;
    double discount;
  }
}
