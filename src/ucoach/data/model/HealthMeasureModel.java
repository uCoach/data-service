package ucoach.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="healthMeasure")
public class HealthMeasureModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private int id;
  private Float value;
  private Date createdDate;
  private HMTypeModel hmType;
  
  // Getters
  public int getId(){
    return id;
  }
  public Float getValue(){
    return value;
  }
  public Date getCreatedDate(){
    return createdDate;
  }

  public HMTypeModel getHmType(){
    return hmType;
  }
  
  // Setters
  public void setId(int id){
    this.id = id;
  }
  public void setValue(Float value){
    this.value = value;
  }
  public void setCreatedDate(Date createdDate){
    this.createdDate = createdDate;
  }
  public void setHmType(HMTypeModel hmType){
    this.hmType = hmType;
  }
}