
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per createUserResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdUser" type="{http://ws.data.ucoach/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUserResponse", propOrder = {
    "createdUser"
})
public class CreateUserResponse {

    protected User createdUser;

    /**
     * Recupera il valore della proprietà createdUser.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getCreatedUser() {
        return createdUser;
    }

    /**
     * Imposta il valore della proprietà createdUser.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setCreatedUser(User value) {
        this.createdUser = value;
    }

}
