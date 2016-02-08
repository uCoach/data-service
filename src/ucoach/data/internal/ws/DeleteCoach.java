
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteCoach complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteCoach">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coachId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteCoach", propOrder = {
    "coachId"
})
public class DeleteCoach {

    protected int coachId;

    /**
     * Gets the value of the coachId property.
     * 
     */
    public int getCoachId() {
        return coachId;
    }

    /**
     * Sets the value of the coachId property.
     * 
     */
    public void setCoachId(int value) {
        this.coachId = value;
    }

}
