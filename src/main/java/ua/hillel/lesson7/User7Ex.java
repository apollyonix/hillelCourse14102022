package ua.hillel.lesson7;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class User7Ex {
  public static void main(String[] args) {
    User7 user7 = new User7();
    user7.setName("name").setPassword("pass").setActive(true);

    user7.setName("name1");
    user7.setPassword("");
    user7.setActive(false);
  }
}
