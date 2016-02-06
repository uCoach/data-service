
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updateCoachResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà updateCoach.
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
     * Imposta il valore della proprietà updateCoach.
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
