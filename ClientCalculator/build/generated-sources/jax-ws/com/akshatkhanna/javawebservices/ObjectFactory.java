
package com.akshatkhanna.javawebservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.akshatkhanna.javawebservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Divide_QNAME = new QName("http://javawebservices.akshatkhanna.com/", "divide");
    private final static QName _DivideResponse_QNAME = new QName("http://javawebservices.akshatkhanna.com/", "divideResponse");
    private final static QName _Muliply_QNAME = new QName("http://javawebservices.akshatkhanna.com/", "muliply");
    private final static QName _MuliplyResponse_QNAME = new QName("http://javawebservices.akshatkhanna.com/", "muliplyResponse");
    private final static QName _AddResponse_QNAME = new QName("http://javawebservices.akshatkhanna.com/", "addResponse");
    private final static QName _Subtract_QNAME = new QName("http://javawebservices.akshatkhanna.com/", "subtract");
    private final static QName _SubtractResponse_QNAME = new QName("http://javawebservices.akshatkhanna.com/", "subtractResponse");
    private final static QName _Add_QNAME = new QName("http://javawebservices.akshatkhanna.com/", "add");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.akshatkhanna.javawebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Subtract }
     * 
     */
    public Subtract createSubtract() {
        return new Subtract();
    }

    /**
     * Create an instance of {@link SubtractResponse }
     * 
     */
    public SubtractResponse createSubtractResponse() {
        return new SubtractResponse();
    }

    /**
     * Create an instance of {@link Muliply }
     * 
     */
    public Muliply createMuliply() {
        return new Muliply();
    }

    /**
     * Create an instance of {@link MuliplyResponse }
     * 
     */
    public MuliplyResponse createMuliplyResponse() {
        return new MuliplyResponse();
    }

    /**
     * Create an instance of {@link Divide }
     * 
     */
    public Divide createDivide() {
        return new Divide();
    }

    /**
     * Create an instance of {@link DivideResponse }
     * 
     */
    public DivideResponse createDivideResponse() {
        return new DivideResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javawebservices.akshatkhanna.com/", name = "divide")
    public JAXBElement<Divide> createDivide(Divide value) {
        return new JAXBElement<Divide>(_Divide_QNAME, Divide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javawebservices.akshatkhanna.com/", name = "divideResponse")
    public JAXBElement<DivideResponse> createDivideResponse(DivideResponse value) {
        return new JAXBElement<DivideResponse>(_DivideResponse_QNAME, DivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Muliply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javawebservices.akshatkhanna.com/", name = "muliply")
    public JAXBElement<Muliply> createMuliply(Muliply value) {
        return new JAXBElement<Muliply>(_Muliply_QNAME, Muliply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MuliplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javawebservices.akshatkhanna.com/", name = "muliplyResponse")
    public JAXBElement<MuliplyResponse> createMuliplyResponse(MuliplyResponse value) {
        return new JAXBElement<MuliplyResponse>(_MuliplyResponse_QNAME, MuliplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javawebservices.akshatkhanna.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javawebservices.akshatkhanna.com/", name = "subtract")
    public JAXBElement<Subtract> createSubtract(Subtract value) {
        return new JAXBElement<Subtract>(_Subtract_QNAME, Subtract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javawebservices.akshatkhanna.com/", name = "subtractResponse")
    public JAXBElement<SubtractResponse> createSubtractResponse(SubtractResponse value) {
        return new JAXBElement<SubtractResponse>(_SubtractResponse_QNAME, SubtractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javawebservices.akshatkhanna.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

}
