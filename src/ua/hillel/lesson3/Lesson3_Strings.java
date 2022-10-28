package ua.hillel.lesson3;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson3_Strings {
  public static void main(String[] args) {
    String string = "string value";
    String newString = new String("new string");

    System.out.println(string.toUpperCase());
    System.out.println(string);

    string.contains("java");

    string.equals("java");
    "java".equals(string);

    String.format("%s %d %f %n", "string value", 5, 5.5);

    System.out.println(5 + " value " + (5 - 1));

  }
}
