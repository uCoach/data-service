
package ucoach.data.internal.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getHealthMeasuresFromUserByTypeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getHealthMeasuresFromUserByTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="healthMeasureFromUserByType" type="{http://ws.data.ucoach/}healthMeasure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHealthMeasuresFromUserByTypeResponse", propOrder = {
    "healthMeasureFromUserByType"
})
public class GetHealthMeasuresFromUserByTypeResponse {

    protected List<HealthMeasure> healthMeasureFromUserByType;

    /**
     * Gets the value of the healthMeasureFromUserByType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthMeasureFromUserByType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthMeasureFromUserByType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthMeasure }
     * 
     * 
     */
    public List<HealthMeasure> getHealthMeasureFromUserByType() {
        if (healthMeasureFromUserByType == null) {
            healthMeasureFromUserByType = new ArrayList<HealthMeasure>();
        }
        return this.healthMeasureFromUserByType;
    }

}
