package ua.hillel.lesson6.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AndroidPhone extends Phone {
  @Override
  void receiveSms(String text) {
    System.out.println("Received sms on android: " + text);
  }

  public void listenToTrack(String track) {
    System.out.println("listen to " + track + " on android");
  }

  @Override
  public void makePhoto() {

  }

  @Override
  public void makeVideo() {

  }

  @Override
  public void listenToPodcast() {

  }
}
