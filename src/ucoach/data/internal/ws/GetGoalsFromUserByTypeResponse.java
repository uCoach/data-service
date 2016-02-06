
package ucoach.data.internal.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getGoalsFromUserByTypeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getGoalsFromUserByTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GoalFromUserByType" type="{http://ws.data.ucoach/}goal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGoalsFromUserByTypeResponse", propOrder = {
    "goalFromUserByType"
})
public class GetGoalsFromUserByTypeResponse {

    @XmlElement(name = "GoalFromUserByType")
    protected List<Goal> goalFromUserByType;

    /**
     * Gets the value of the goalFromUserByType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goalFromUserByType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoalFromUserByType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Goal }
     * 
     * 
     */
    public List<Goal> getGoalFromUserByType() {
        if (goalFromUserByType == null) {
            goalFromUserByType = new ArrayList<Goal>();
        }
        return this.goalFromUserByType;
    }

}
