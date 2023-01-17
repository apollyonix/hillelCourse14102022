package ua.hillel.lesson8;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MainClass {
  public static void main(String[] args) {
//    new FinalExample(1).finalMethod();
//
//    new ChildClass().changeValue();
//
//
//    StaticExample.staticValue = 11;
//
//    StaticExample staticExample1 = new StaticExample();
//    staticExample1.nonStaticValue = 2;
//    staticExample1.getNonStaticValue();
//
//
//    StaticExample staticExample2 = new StaticExample();
//    staticExample2.nonStaticValue = 3;
//    staticExample2.getNonStaticValue();
//
//    StaticExample.getStaticValue();
//


    new ProductPage().createProduct(Status.NEW);
    new ProductPage().createProduct(Status.OUT_OF_SALE);

    System.out.println(Status.OUT_OF_SALE.getStatus());
  }
}
