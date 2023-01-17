package ua.hillel.lesson7;

import ua.hillel.lesson6.User;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson7Main {
  public static void main(String[] args) {
    Lesson7Ex lesson7Ex = new Lesson7Ex("value");
//    lesson7Ex.methodWithParams(1, true, "name");


    int a = 10;
    lesson7Ex.increaseNumber(a);
    System.out.println(a);


    User user = new User();
    user.setActive(true);
    lesson7Ex.updateUser(user);

    System.out.println(user.isActive());

    lesson7Ex.addProductsToCart();
    lesson7Ex.addProductsToCart("prod1");
    lesson7Ex.addProductsToCart("prod1", "prod2", "prod3");

    String[] prods = new String[0];
    lesson7Ex.addProductsToCartWithArray(prods);

//    lesson7Ex.methodWithVarArg("user1", "user1", prods);
//    lesson7Ex.methodWithVarArg("user1", "user1", "admin");
//    lesson7Ex.methodWithVarArg("user1", "user1", "guest", "new");



    lesson7Ex.overloadedMethod(1);
    lesson7Ex.overloadedMethod(1.45);
    lesson7Ex.overloadedMethod("1");
  }
}
