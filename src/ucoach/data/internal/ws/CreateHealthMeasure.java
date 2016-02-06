
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per createHealthMeasure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createHealthMeasure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="healthMeasure" type="{http://ws.data.ucoach/}healthMeasure" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hmTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createHealthMeasure", propOrder = {
    "healthMeasure",
    "userId",
    "hmTypeId"
})
public class CreateHealthMeasure {

    protected HealthMeasure healthMeasure;
    protected int userId;
    protected int hmTypeId;

    /**
     * Recupera il valore della proprietà healthMeasure.
     * 
     * @return
     *     possible object is
     *     {@link HealthMeasure }
     *     
     */
    public HealthMeasure getHealthMeasure() {
        return healthMeasure;
    }

    /**
     * Imposta il valore della proprietà healthMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthMeasure }
     *     
     */
    public void setHealthMeasure(HealthMeasure value) {
        this.healthMeasure = value;
    }

    /**
     * Recupera il valore della proprietà userId.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Imposta il valore della proprietà userId.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Recupera il valore della proprietà hmTypeId.
     * 
     */
    public int getHmTypeId() {
        return hmTypeId;
    }

    /**
     * Imposta il valore della proprietà hmTypeId.
     * 
     */
    public void setHmTypeId(int value) {
        this.hmTypeId = value;
    }

}