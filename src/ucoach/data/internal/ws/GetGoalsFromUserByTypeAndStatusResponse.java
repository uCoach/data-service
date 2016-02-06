
package ucoach.data.internal.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getGoalsFromUserByTypeAndStatusResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getGoalsFromUserByTypeAndStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GoalFromUserByTypeAndStatus" type="{http://ws.data.ucoach/}goal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGoalsFromUserByTypeAndStatusResponse", propOrder = {
    "goalFromUserByTypeAndStatus"
})
public class GetGoalsFromUserByTypeAndStatusResponse {

    @XmlElement(name = "GoalFromUserByTypeAndStatus")
    protected List<Goal> goalFromUserByTypeAndStatus;

    /**
     * Gets the value of the goalFromUserByTypeAndStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goalFromUserByTypeAndStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoalFromUserByTypeAndStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Goal }
     * 
     * 
     */
    public List<Goal> getGoalFromUserByTypeAndStatus() {
        if (goalFromUserByTypeAndStatus == null) {
            goalFromUserByTypeAndStatus = new ArrayList<Goal>();
        }
        return this.goalFromUserByTypeAndStatus;
    }

}
