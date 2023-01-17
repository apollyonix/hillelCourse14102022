package ua.hillel.lesson7.pages;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AdminDetailPage extends UserDetailPage {
  public AdminDetailPage() {
    super("admin");

    System.out.println("created " + super.value);
  }
  @Override
  public void getUserDetails() {
    super.getUserDetails();
    System.out.println("admin detail page");
  }

}
