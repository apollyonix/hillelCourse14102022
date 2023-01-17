package ua.hillel.lesson4;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DoWhileLoopExample {
  public static void main(String[] args) {
    boolean flag = false;

    do {
      System.out.println("Do-While loop");
    } while (flag);


    String user1 = getRandomUser();
    String user2;

    do {
      user2 = getRandomUser();
    } while (user2.equals(user1));
  }


  private static String getRandomUser() {
    return "";
  }
}
