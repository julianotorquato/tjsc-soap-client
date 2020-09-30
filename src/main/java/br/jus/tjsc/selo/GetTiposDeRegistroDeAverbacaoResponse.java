
package br.jus.tjsc.selo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTiposDeRegistroDeAverbacaoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTiposDeRegistroDeAverbacaoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tiposDeRegistroDeAverbacao" type="{http://www.tjsc.jus.br/selo}tipoRegistroAverbacao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTiposDeRegistroDeAverbacaoResponse", propOrder = {
    "tiposDeRegistroDeAverbacao"
})
public class GetTiposDeRegistroDeAverbacaoResponse {

    protected List<TipoRegistroAverbacao> tiposDeRegistroDeAverbacao;

    /**
     * Gets the value of the tiposDeRegistroDeAverbacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiposDeRegistroDeAverbacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposDeRegistroDeAverbacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoRegistroAverbacao }
     * 
     * 
     */
    public List<TipoRegistroAverbacao> getTiposDeRegistroDeAverbacao() {
        if (tiposDeRegistroDeAverbacao == null) {
            tiposDeRegistroDeAverbacao = new ArrayList<TipoRegistroAverbacao>();
        }
        return this.tiposDeRegistroDeAverbacao;
    }

}
