package ua.hillel.lesson6;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class User {
  private String username;
  private String email;
  private String firstname;
  private String lastname;
  private int age;

  private boolean active;

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  @Override
  public String toString() {
    return "User{" + "username='" + username + '\'' + ", email='" + email + '\'' + ", firstname='"
        + firstname + '\'' + ", lastname='" + lastname + '\'' + ", age=" + age + ", active="
        + active + '}';
  }

  @Override
  public boolean equals(Object u) {
    User user = (User) u;
    return this.username.equals(user.username);
  }
}
