package ua.hillel.lesson14;

import com.github.javafaker.Faker;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FakerEx {
  public static void main(String[] args) {
    Faker faker = new Faker();
    for (int i=0; i<3; i++) {
      String name = faker.name().firstName();
      String lastname = faker.name().lastName();

      System.out.println(name + " " + lastname);
    }
  }
}
