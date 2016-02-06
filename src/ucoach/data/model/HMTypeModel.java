package ucoach.data.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="healthMeasurementType")
public class HMTypeModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private int id;
  private String name;
  private String units;
  
  // Getters
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public String getUnits(){
    return units;
  }
  
  // Setters
  public void setId(int id){
    this.id = id;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setUnits(String units){
    this.units = units;
  }
}