package ua.hillel.lesson7.pages;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UserDetailPage {
  protected String value;

  public UserDetailPage() {

  }

  public UserDetailPage(String userValue) {
    this.value = userValue;
    System.out.println(userValue);
  }
  public void getUserDetails() {
    System.out.println("user details");
  }
}
