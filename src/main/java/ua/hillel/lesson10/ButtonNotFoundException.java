package ua.hillel.lesson10;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ButtonNotFoundException extends RuntimeException {
  public ButtonNotFoundException(String page, String message) {
    super("On page " + page + " " + message) ;
  }
}
