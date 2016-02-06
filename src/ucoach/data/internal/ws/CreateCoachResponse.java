
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per createCoachResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createCoachResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdCoach" type="{http://ws.data.ucoach/}coach" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCoachResponse", propOrder = {
    "createdCoach"
})
public class CreateCoachResponse {

    protected Coach createdCoach;

    /**
     * Recupera il valore della proprietà createdCoach.
     * 
     * @return
     *     possible object is
     *     {@link Coach }
     *     
     */
    public Coach getCreatedCoach() {
        return createdCoach;
    }

    /**
     * Imposta il valore della proprietà createdCoach.
     * 
     * @param value
     *     allowed object is
     *     {@link Coach }
     *     
     */
    public void setCreatedCoach(Coach value) {
        this.createdCoach = value;
    }

}