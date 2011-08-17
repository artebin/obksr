//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.12 at 04:42:10 PM CEST 
//


package net.trevize.openbox.jaxb;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://openbox.org/3.4/rc}focusNew"/>
 *         &lt;element ref="{http://openbox.org/3.4/rc}followMouse"/>
 *         &lt;element ref="{http://openbox.org/3.4/rc}focusLast"/>
 *         &lt;element ref="{http://openbox.org/3.4/rc}underMouse"/>
 *         &lt;element ref="{http://openbox.org/3.4/rc}focusDelay"/>
 *         &lt;element ref="{http://openbox.org/3.4/rc}raiseOnFocus"/>
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
    "focusNew",
    "followMouse",
    "focusLast",
    "underMouse",
    "focusDelay",
    "raiseOnFocus"
})
@XmlRootElement(name = "focus")
public class Focus {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String focusNew;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String followMouse;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String focusLast;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String underMouse;
    @XmlElement(required = true)
    protected BigInteger focusDelay;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String raiseOnFocus;

    /**
     * Gets the value of the focusNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocusNew() {
        return focusNew;
    }

    /**
     * Sets the value of the focusNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocusNew(String value) {
        this.focusNew = value;
    }

    /**
     * Gets the value of the followMouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollowMouse() {
        return followMouse;
    }

    /**
     * Sets the value of the followMouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowMouse(String value) {
        this.followMouse = value;
    }

    /**
     * Gets the value of the focusLast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocusLast() {
        return focusLast;
    }

    /**
     * Sets the value of the focusLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocusLast(String value) {
        this.focusLast = value;
    }

    /**
     * Gets the value of the underMouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderMouse() {
        return underMouse;
    }

    /**
     * Sets the value of the underMouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderMouse(String value) {
        this.underMouse = value;
    }

    /**
     * Gets the value of the focusDelay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFocusDelay() {
        return focusDelay;
    }

    /**
     * Sets the value of the focusDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFocusDelay(BigInteger value) {
        this.focusDelay = value;
    }

    /**
     * Gets the value of the raiseOnFocus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaiseOnFocus() {
        return raiseOnFocus;
    }

    /**
     * Sets the value of the raiseOnFocus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaiseOnFocus(String value) {
        this.raiseOnFocus = value;
    }

}