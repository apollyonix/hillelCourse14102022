package ua.hillel.lesson12;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MapExample {
  public static void main(String[] args) {
//    Map<String, Integer> map = new HashMap<>();
//    map.put("one", 1);
//    map.put("two", 2);
//    map.put("three", 3);
//
//
//    map.put("two", 6);
//
//    System.out.println(map.size());
//
//    System.out.println(map);
//
//    map.get("one");
//    map.getOrDefault("five", 0);
//
//
//    map.keySet();
//
//    for (String key : map.keySet()) {
//      map.get(key);
//    }
//
//    map.values();
//
//    for (Map.Entry<String, Integer> entry : map.entrySet()) {
//      entry.getKey();
//      entry.getValue();
//    }

    User user = new User();
    user.setUsername("user1");
    System.out.println(user.hashCode());

    Map<User, String> userMap = new HashMap<>();
    userMap.put(user, "111");

    user.setAge(25);
    System.out.println(user.hashCode());

    System.out.println(userMap.get(user));
    System.out.println(userMap);

  }
}
