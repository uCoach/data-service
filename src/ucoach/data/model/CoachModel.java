package ucoach.data.model;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="coach")
public class CoachModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private int id;
  private String lastname;
  private String firstname;
  private String birthdate;
  private String email;
  private String password;
  
  // Getters
  public int getId(){
    return id;
  }
  public String getLastname(){
    return lastname;
  }
  public String getFirstname(){
    return firstname;
  }
  public String getBirthdate(){
    return birthdate;
  }
  public String getEmail(){
    return email;
  }
  public String getPassword(){
    return password;
  }
  
  // Setters
  public void setId(int id){
    this.id = id;
  }
  public void setLastname(String lastname){
    this.lastname = lastname;
  }
  public void setFirstname(String firstname){
    this.firstname = firstname;
  }
  public void setBirthdate(String birthdate){
    this.birthdate = birthdate;
  }
  public void setEmail(String email){
    this.email = email;
  }
  public void setPassword(String password){
    this.password = password;
  }
}