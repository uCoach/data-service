
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateCoachResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateCoachResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateCoach" type="{http://ws.data.ucoach/}coach" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCoachResponse", propOrder = {
    "updateCoach"
})
public class UpdateCoachResponse {

    protected Coach updateCoach;

    /**
     * Gets the value of the updateCoach property.
     * 
     * @return
     *     possible object is
     *     {@link Coach }
     *     
     */
    public Coach getUpdateCoach() {
        return updateCoach;
    }

    /**
     * Sets the value of the updateCoach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coach }
     *     
     */
    public void setUpdateCoach(Coach value) {
        this.updateCoach = value;
    }

}
