
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per createHealthMeasureResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createHealthMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdHealthMeasure" type="{http://ws.data.ucoach/}healthMeasure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createHealthMeasureResponse", propOrder = {
    "createdHealthMeasure"
})
public class CreateHealthMeasureResponse {

    protected HealthMeasure createdHealthMeasure;

    /**
     * Recupera il valore della proprietà createdHealthMeasure.
     * 
     * @return
     *     possible object is
     *     {@link HealthMeasure }
     *     
     */
    public HealthMeasure getCreatedHealthMeasure() {
        return createdHealthMeasure;
    }

    /**
     * Imposta il valore della proprietà createdHealthMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthMeasure }
     *     
     */
    public void setCreatedHealthMeasure(HealthMeasure value) {
        this.createdHealthMeasure = value;
    }

}
