package ua.hillel.lesson6.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public abstract class Phone implements Listening,Filming {
  public void makeCall(String number) {
    System.out.println("calling " + number);
  }

  public void receiveCall(String num) {
    System.out.println("new call from " + num);
  }

  abstract void receiveSms(String text);
}
