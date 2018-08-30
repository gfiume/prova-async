
package org.example.schema.doubleit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="doubledNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "doubledNumber"
})
@XmlRootElement(name = "DoubleItResponse")
public class DoubleItResponse {

    protected int doubledNumber;

    /**
     * Recupera il valore della proprietà doubledNumber.
     * 
     */
    public int getDoubledNumber() {
        return doubledNumber;
    }

    /**
     * Imposta il valore della proprietà doubledNumber.
     * 
     */
    public void setDoubledNumber(int value) {
        this.doubledNumber = value;
    }

}
