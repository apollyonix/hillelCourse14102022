package ua.hillel.lesson9;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CatalogTest {
  public static void main(String[] args) {
    CatalogPage catalogPage = new CatalogPage();

    catalogPage.filterByCategory("phone");
    CatalogPage.ProductTable productTable = catalogPage.new ProductTable();

    assert productTable.category.equals("phone");

    catalogPage.filterByPrice(500);
    productTable = catalogPage.new ProductTable();

    assert productTable.price < 500;
  }
}
