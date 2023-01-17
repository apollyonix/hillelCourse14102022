package ua.hillel.rest.entities;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
public class User {
  private Integer id;
  private String username;
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private String phone;
  private Integer userStatus;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();


  private String myCoolField;

}
