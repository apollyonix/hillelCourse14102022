package ua.hillel.lesson6.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PhoneExample {
  public static void main(String[] args) {
    Phone phone = new AndroidPhone();
    phone.receiveSms("hello java");

    phone = new IPhone();
    phone.receiveSms("hello java");


    IPhone iPhone2 = new IPhone();
    iPhone2.receiveSms("hello java");
  }
}
