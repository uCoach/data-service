
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getCoachResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getCoachResponse">
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
@XmlType(name = "getCoachResponse", propOrder = {
    "coach"
})
public class GetCoachResponse {

    protected Coach coach;

    /**
     * Recupera il valore della proprietà coach.
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
     * Imposta il valore della proprietà coach.
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
