
package soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap package. 
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

    private final static QName _GetSellerInfos_QNAME = new QName("http://warehousews.mycompany.com/", "getSellerInfos");
    private final static QName _GetBookInfos_QNAME = new QName("http://warehousews.mycompany.com/", "getBookInfos");
    private final static QName _GetBookInfosResponse_QNAME = new QName("http://warehousews.mycompany.com/", "getBookInfosResponse");
    private final static QName _GetSellerInfosResponse_QNAME = new QName("http://warehousews.mycompany.com/", "getSellerInfosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSellerInfos }
     * 
     */
    public GetSellerInfos createGetSellerInfos() {
        return new GetSellerInfos();
    }

    /**
     * Create an instance of {@link GetBookInfos }
     * 
     */
    public GetBookInfos createGetBookInfos() {
        return new GetBookInfos();
    }

    /**
     * Create an instance of {@link GetSellerInfosResponse }
     * 
     */
    public GetSellerInfosResponse createGetSellerInfosResponse() {
        return new GetSellerInfosResponse();
    }

    /**
     * Create an instance of {@link GetBookInfosResponse }
     * 
     */
    public GetBookInfosResponse createGetBookInfosResponse() {
        return new GetBookInfosResponse();
    }

    /**
     * Create an instance of {@link Seller }
     * 
     */
    public Seller createSeller() {
        return new Seller();
    }

    /**
     * Create an instance of {@link CommercialBook }
     * 
     */
    public CommercialBook createCommercialBook() {
        return new CommercialBook();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSellerInfos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://warehousews.mycompany.com/", name = "getSellerInfos")
    public JAXBElement<GetSellerInfos> createGetSellerInfos(GetSellerInfos value) {
        return new JAXBElement<GetSellerInfos>(_GetSellerInfos_QNAME, GetSellerInfos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookInfos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://warehousews.mycompany.com/", name = "getBookInfos")
    public JAXBElement<GetBookInfos> createGetBookInfos(GetBookInfos value) {
        return new JAXBElement<GetBookInfos>(_GetBookInfos_QNAME, GetBookInfos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookInfosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://warehousews.mycompany.com/", name = "getBookInfosResponse")
    public JAXBElement<GetBookInfosResponse> createGetBookInfosResponse(GetBookInfosResponse value) {
        return new JAXBElement<GetBookInfosResponse>(_GetBookInfosResponse_QNAME, GetBookInfosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSellerInfosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://warehousews.mycompany.com/", name = "getSellerInfosResponse")
    public JAXBElement<GetSellerInfosResponse> createGetSellerInfosResponse(GetSellerInfosResponse value) {
        return new JAXBElement<GetSellerInfosResponse>(_GetSellerInfosResponse_QNAME, GetSellerInfosResponse.class, null, value);
    }

}
