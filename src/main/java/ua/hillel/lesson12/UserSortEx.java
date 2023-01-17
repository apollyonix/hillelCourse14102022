package ua.hillel.lesson12;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UserSortEx {
  public static void main(String[] args) {
    Set<User> users = new TreeSet<>();

    User user1 = new User();
    user1.setUsername("user1");

    User user2 = new User();
    user2.setUsername("user2");

    User adminUser = new User();
    adminUser.setUsername("admin");

    users.add(user1);
    users.add(user2);
    users.add(adminUser);

    System.out.println(users);
  }
}
