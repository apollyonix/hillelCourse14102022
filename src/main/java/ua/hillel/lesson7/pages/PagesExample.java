package ua.hillel.lesson7.pages;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PagesExample {
  public static void main(String[] args) {
    UserDetailPage userDetailPage = new UserDetailPage("user");
//    userDetailPage.getUserDetails();

    userDetailPage = new AdminDetailPage();
//    userDetailPage.getUserDetails();



  }
}
