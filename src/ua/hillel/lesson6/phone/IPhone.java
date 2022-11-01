package ua.hillel.lesson6.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class IPhone extends Phone implements Listening,Filming {
  @Override
  void receiveSms(String text) {
    System.out.println("Received sms on IPhone: " + text);
  }

  @Override
  public void makePhoto() {
    initCamera();
    takeShot();
    closeCamera();
  }

  @Override
  public void makeVideo() {

  }

  @Override
  public void listenToPodcast() {

  }

  @Override
  public void listenToTrack(String track) {
    System.out.println("listen to " + track + " on iphone");
  }

  private void initCamera() {
    System.out.println("Camera initialized");
  }

  private void takeShot() {
    System.out.println("click");
  }

  private void closeCamera() {
    System.out.println("Camera closed");
  }
}
