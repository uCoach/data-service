
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setTokens complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setTokens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refreshToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setTokens", propOrder = {
    "userId",
    "accessToken",
    "refreshToken"
})
public class SetTokens {

    protected int userId;
    protected String accessToken;
    protected String refreshToken;

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
     * Gets the value of the accessToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of the accessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

    /**
     * Gets the value of the refreshToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * Sets the value of the refreshToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefreshToken(String value) {
        this.refreshToken = value;
    }

}
