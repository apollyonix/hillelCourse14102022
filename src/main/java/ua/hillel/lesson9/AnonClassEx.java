package ua.hillel.lesson9;

import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AnonClassEx {
  public static void main(String[] args) {

    InnerInterface innerInterface = new InnerInterface() {
      @Override
      public void someMethod() {
        System.out.println("I'm anon class");
      }

      @Override
      public int getRandom(int max) {
        return new Random().nextInt(max);
      }
    };

    innerInterface.someMethod();



    innerInterface = new InnerInterface() {
      @Override
      public void someMethod() {
        System.out.println("Another impl");
      }

      @Override public int getRandom(int max) {
        return 0;
      }
    };

    innerInterface.someMethod();
  }
}
