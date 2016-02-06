
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per deleteHealthMeasure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="deleteHealthMeasure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="healthMeasureId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteHealthMeasure", propOrder = {
    "healthMeasureId"
})
public class DeleteHealthMeasure {

    protected int healthMeasureId;

    /**
     * Recupera il valore della proprietà healthMeasureId.
     * 
     */
    public int getHealthMeasureId() {
        return healthMeasureId;
    }

    /**
     * Imposta il valore della proprietà healthMeasureId.
     * 
     */
    public void setHealthMeasureId(int value) {
        this.healthMeasureId = value;
    }

}
