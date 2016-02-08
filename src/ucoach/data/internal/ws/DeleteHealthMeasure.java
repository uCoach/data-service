
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteHealthMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteHealthMeasure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="healthMeasureId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteHealthMeasure", propOrder = {
    "healthMeasureId"
})
public class DeleteHealthMeasure {

    protected int healthMeasureId;

    /**
     * Gets the value of the healthMeasureId property.
     * 
     */
    public int getHealthMeasureId() {
        return healthMeasureId;
    }

    /**
     * Sets the value of the healthMeasureId property.
     * 
     */
    public void setHealthMeasureId(int value) {
        this.healthMeasureId = value;
    }

}
