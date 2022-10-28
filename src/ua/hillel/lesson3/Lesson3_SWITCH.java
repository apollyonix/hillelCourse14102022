package ua.hillel.lesson3;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson3_SWITCH {
  public static void main(String[] args) {
    int dayOfWeek = 17;

    switch (dayOfWeek) {
      case 1:
        System.out.println("it's Monday");
        break;

      case 2:
        System.out.println("it's Tuesday");
        break;

      case 3:
        System.out.println("it's Wednesday");
        break;

      case 4:
        System.out.println("it's Thursday");
        break;

      case 5:
        System.out.println("it's Friday");
        break;

      case 6:
      case 7:
      case 0:
        System.out.println("it's holiday");
        break;

      default:
        System.out.println("Wrong day of week");
    }
  }
}
