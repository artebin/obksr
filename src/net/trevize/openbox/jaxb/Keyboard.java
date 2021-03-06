//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.12 at 04:42:10 PM CEST 
//


package net.trevize.openbox.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://openbox.org/3.4/rc}chainQuitKey"/>
 *         &lt;element ref="{http://openbox.org/3.4/rc}keybind" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "chainQuitKey",
    "keybind"
})
@XmlRootElement(name = "keyboard")
public class Keyboard {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String chainQuitKey;
    @XmlElement(required = true)
    protected List<Keybind> keybind;

    /**
     * Gets the value of the chainQuitKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainQuitKey() {
        return chainQuitKey;
    }

    /**
     * Sets the value of the chainQuitKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainQuitKey(String value) {
        this.chainQuitKey = value;
    }

    /**
     * Gets the value of the keybind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keybind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeybind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Keybind }
     * 
     * 
     */
    public List<Keybind> getKeybind() {
        if (keybind == null) {
            keybind = new ArrayList<Keybind>();
        }
        return this.keybind;
    }

}
