
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createCoach complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createCoach">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coach" type="{http://ws.data.ucoach/}coach" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCoach", propOrder = {
    "coach"
})
public class CreateCoach {

    protected Coach coach;

    /**
     * Gets the value of the coach property.
     * 
     * @return
     *     possible object is
     *     {@link Coach }
     *     
     */
    public Coach getCoach() {
        return coach;
    }

    /**
     * Sets the value of the coach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coach }
     *     
     */
    public void setCoach(Coach value) {
        this.coach = value;
    }

}
