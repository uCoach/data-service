
package ucoach.data.internal.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getGoalsFromUserAfterDueDateResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getGoalsFromUserAfterDueDateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GoalsFromUserAfterDueDate" type="{http://ws.data.ucoach/}goal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGoalsFromUserAfterDueDateResponse", propOrder = {
    "goalsFromUserAfterDueDate"
})
public class GetGoalsFromUserAfterDueDateResponse {

    @XmlElement(name = "GoalsFromUserAfterDueDate")
    protected List<Goal> goalsFromUserAfterDueDate;

    /**
     * Gets the value of the goalsFromUserAfterDueDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goalsFromUserAfterDueDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoalsFromUserAfterDueDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Goal }
     * 
     * 
     */
    public List<Goal> getGoalsFromUserAfterDueDate() {
        if (goalsFromUserAfterDueDate == null) {
            goalsFromUserAfterDueDate = new ArrayList<Goal>();
        }
        return this.goalsFromUserAfterDueDate;
    }

}
