
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per createGoalResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createGoalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdGoal" type="{http://ws.data.ucoach/}goal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createGoalResponse", propOrder = {
    "createdGoal"
})
public class CreateGoalResponse {

    protected Goal createdGoal;

    /**
     * Recupera il valore della proprietà createdGoal.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    public Goal getCreatedGoal() {
        return createdGoal;
    }

    /**
     * Imposta il valore della proprietà createdGoal.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    public void setCreatedGoal(Goal value) {
        this.createdGoal = value;
    }

}
