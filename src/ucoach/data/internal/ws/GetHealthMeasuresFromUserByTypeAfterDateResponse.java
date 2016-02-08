
package ucoach.data.internal.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getHealthMeasuresFromUserByTypeAfterDateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getHealthMeasuresFromUserByTypeAfterDateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="healthMeasureFromUserByTypeAfterDate" type="{http://ws.data.ucoach/}healthMeasure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHealthMeasuresFromUserByTypeAfterDateResponse", propOrder = {
    "healthMeasureFromUserByTypeAfterDate"
})
public class GetHealthMeasuresFromUserByTypeAfterDateResponse {

    protected List<HealthMeasure> healthMeasureFromUserByTypeAfterDate;

    /**
     * Gets the value of the healthMeasureFromUserByTypeAfterDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthMeasureFromUserByTypeAfterDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthMeasureFromUserByTypeAfterDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthMeasure }
     * 
     * 
     */
    public List<HealthMeasure> getHealthMeasureFromUserByTypeAfterDate() {
        if (healthMeasureFromUserByTypeAfterDate == null) {
            healthMeasureFromUserByTypeAfterDate = new ArrayList<HealthMeasure>();
        }
        return this.healthMeasureFromUserByTypeAfterDate;
    }

}
