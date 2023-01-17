package ua.hillel.lesson7;

import ua.hillel.lesson6.User;
import ua.hillel.lesson6.phone.IPhone;
import ua.hillel.lesson6.phone.Phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson7Ex {
  private String value;
  public Lesson7Ex() {

  }
  public Lesson7Ex(String value) {
    this.value = value;
  }

  /*
  *ACCESS_MODIFIER *RETURN_TYPE *NAME(PARAMETERS) {
  }
   */


  public void doSmthWithoutReturn() {
    //
  }

  public int getRandomNumber() {

    return 0;
  }

  public String getRandomStringValue() {
    return null;
  }

  public Phone getPhone() {
    Phone phone = new IPhone();
    return phone;
  }

  public void methodWithParams(int i, boolean isActive, String name) {

  }

  public void increaseNumber(int i) {
    i += 10;
    System.out.println(i);
  }

  public void updateUser(User user) {
    user.setActive(false);
  }

  public void addProductsToCart(String... products) {

  }

  public void addProductToCart(String product) {
    addProductToCart(product, 1);
  }

  public void addProductToCart(String product, int qty) {
    //search product
    //click to add

    //if qty > 1 -- set qty

    //close cart popup
  }

  public void addProductsToCartWithArray(String[] products) {

  }

  public void methodWithVarArg(String name, String lastname, String... roles) {

    for (String role : roles) {
      System.out.println(role);
    }
  }


  public void overloadedMethod(int i) {
    System.out.println("int value: " + i);
  }

  public void overloadedMethod(double d) {
    System.out.println("double value: " + d);
  }

  public void overloadedMethod(String i) {
    System.out.println("String value: " + i);
  }

}
