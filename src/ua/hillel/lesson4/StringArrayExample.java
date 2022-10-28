package ua.hillel.lesson4;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class StringArrayExample {

  public static void main(String[] args) {
    String categories = "PC,Phone,Notebook,Tablet,Smartwatch";

    String[] cats = categories.split(",");
    for (String category : cats) {
      System.out.println("Navigate to " + category + " and check products");
    }
  }
}
