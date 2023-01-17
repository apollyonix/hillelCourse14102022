package ua.hillel.lesson6;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson6Ex {
  public static void main(String[] args) {
    User user1 = new User();
    user1.setUsername("user1");


    User user2 = new User();
    user2 = user1;
    user2.setUsername("asdasdasd");

//    System.out.println(user1.equals(user2));
    System.out.println(user1.getUsername());

  }
}
