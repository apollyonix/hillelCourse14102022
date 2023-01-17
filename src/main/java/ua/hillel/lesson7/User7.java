package ua.hillel.lesson7;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class User7 {
  private String name;
  private String password;
  private String email;
  private boolean isActive;

  public User7() {

  }

  public User7(String name, String password, String email, boolean isActive) {
    this.name = name;
    this.password = password;
    this.email = email;
    this.isActive = isActive;
  }

  public String getName() {
    return name;
  }

  public User7 setName(String name) {
    this.name = name;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public User7 setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public User7 setEmail(String email) {
    this.email = email;
    return this;
  }

  public boolean isActive() {
    return isActive;
  }

  public User7 setActive(boolean active) {
    isActive = active;
    return this;
  }
}
