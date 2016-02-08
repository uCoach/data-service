
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createHealthMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createHealthMeasure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="healthMeasure" type="{http://ws.data.ucoach/}healthMeasure" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hmTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createHealthMeasure", propOrder = {
    "healthMeasure",
    "userId",
    "hmTypeId"
})
public class CreateHealthMeasure {

    protected HealthMeasure healthMeasure;
    protected int userId;
    protected int hmTypeId;

    /**
     * Gets the value of the healthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link HealthMeasure }
     *     
     */
    public HealthMeasure getHealthMeasure() {
        return healthMeasure;
    }

    /**
     * Sets the value of the healthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthMeasure }
     *     
     */
    public void setHealthMeasure(HealthMeasure value) {
        this.healthMeasure = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Gets the value of the hmTypeId property.
     * 
     */
    public int getHmTypeId() {
        return hmTypeId;
    }

    /**
     * Sets the value of the hmTypeId property.
     * 
     */
    public void setHmTypeId(int value) {
        this.hmTypeId = value;
    }

}
