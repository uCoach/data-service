
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getHealthMeasuresFromUserByTypeAfterDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getHealthMeasuresFromUserByTypeAfterDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hmTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="afterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHealthMeasuresFromUserByTypeAfterDate", propOrder = {
    "userId",
    "hmTypeId",
    "afterDate"
})
public class GetHealthMeasuresFromUserByTypeAfterDate {

    protected int userId;
    protected int hmTypeId;
    protected String afterDate;

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Gets the value of the hmTypeId property.
     * 
     */
    public int getHmTypeId() {
        return hmTypeId;
    }

    /**
     * Sets the value of the hmTypeId property.
     * 
     */
    public void setHmTypeId(int value) {
        this.hmTypeId = value;
    }

    /**
     * Gets the value of the afterDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterDate() {
        return afterDate;
    }

    /**
     * Sets the value of the afterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterDate(String value) {
        this.afterDate = value;
    }

}
