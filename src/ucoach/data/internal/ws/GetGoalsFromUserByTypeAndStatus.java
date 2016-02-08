
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGoalsFromUserByTypeAndStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGoalsFromUserByTypeAndStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hmTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="achieved" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGoalsFromUserByTypeAndStatus", propOrder = {
    "userId",
    "hmTypeId",
    "achieved"
})
public class GetGoalsFromUserByTypeAndStatus {

    protected int userId;
    protected int hmTypeId;
    protected int achieved;

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

    /**
     * Gets the value of the achieved property.
     * 
     */
    public int getAchieved() {
        return achieved;
    }

    /**
     * Sets the value of the achieved property.
     * 
     */
    public void setAchieved(int value) {
        this.achieved = value;
    }

}
