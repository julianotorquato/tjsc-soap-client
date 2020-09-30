
package br.jus.tjsc.selo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTiposDeCobranca20Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTiposDeCobranca20Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tiposDeCobranca20" type="{http://www.tjsc.jus.br/selo}tipoCobranca20" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTiposDeCobranca20Response", propOrder = {
    "tiposDeCobranca20"
})
public class GetTiposDeCobranca20Response {

    protected List<TipoCobranca20> tiposDeCobranca20;

    /**
     * Gets the value of the tiposDeCobranca20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiposDeCobranca20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposDeCobranca20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoCobranca20 }
     * 
     * 
     */
    public List<TipoCobranca20> getTiposDeCobranca20() {
        if (tiposDeCobranca20 == null) {
            tiposDeCobranca20 = new ArrayList<TipoCobranca20>();
        }
        return this.tiposDeCobranca20;
    }

}
