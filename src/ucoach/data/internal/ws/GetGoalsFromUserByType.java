
package ucoach.data.internal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getGoalsFromUserByType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getGoalsFromUserByType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "getGoalsFromUserByType", propOrder = {
    "userId",
    "hmTypeId"
})
public class GetGoalsFromUserByType {

    protected int userId;
    protected int hmTypeId;

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
