package ucoach.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="goal")
public class GoalModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private int id;
  private String frequency;
  private String objective;
  private Float value;
  private Date createdDate;
  private Date dueDate;
  private int achieved;
  private HMTypeModel hmType;
  
  // Getters
  public int getId(){
    return id;
  }
  public String getFrequency(){
    return frequency;
  }
  public String getObjective(){
    return objective;
  }
  public Float getValue(){
    return value;
  }
  public Date getCreatedDate(){
    return createdDate;
  }
  public Date getDueDate(){
    return dueDate;
  }
  public int getAchieved(){
    return achieved;
  }
  public HMTypeModel getHmType(){
    return hmType;
  }
  
  // Setters
  public void setId(int id){
    this.id = id;
  }
  public void setFrequency(String frequency){
    this.frequency = frequency;
  }
  public void setObjective(String objective){
    this.objective = objective;
  }
  public void setValue(Float value){
    this.value = value;
  }
  public void setCreatedDate(Date createdDate){
    this.createdDate = createdDate;
  }
  public void setDueDate(Date dueDate){
    this.dueDate = dueDate;
  }
  public void setAchieved(int achieved){
    this.achieved = achieved;
  }
  public void setHmType(HMTypeModel hmType){
    this.hmType = hmType;
  }
}