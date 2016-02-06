package ucoach.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="user")
@XmlType(propOrder={"id","firstname","lastname", "email", "birthdate", "currentHealthMeasures", "password"})
public class UserModel implements Serializable {
	private static final long serialVersionUID = 1L;

  private int id;
  private String lastname;
  private String firstname;
  private String birthdate;
  private String email;
  private String password;
  private CoachModel coach;
  private List<HealthMeasureModel> currentHealthMeasures;

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

  @XmlElementWrapper(name="currentHealthMeasures")
  @XmlElement(name="healthMeasure")
  public List<HealthMeasureModel> getCurrentHealthMeasures(){
    return currentHealthMeasures;
  }

  public CoachModel getCoach(){
    return coach;
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
  public void setCurrentHealthMeasures(List<HealthMeasureModel> healthMeasures){
    this.currentHealthMeasures = healthMeasures;
  }

  public void setCoach(CoachModel coach){
    this.coach = coach;
  }
}
