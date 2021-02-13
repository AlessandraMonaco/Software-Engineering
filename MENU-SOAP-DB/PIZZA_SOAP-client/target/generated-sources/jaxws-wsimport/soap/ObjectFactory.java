
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

    private final static QName _GetDrink_QNAME = new QName("http://pizza_soapws.mycompany.com/", "getDrink");
    private final static QName _GetFoodMenu_QNAME = new QName("http://pizza_soapws.mycompany.com/", "getFoodMenu");
    private final static QName _GetFoodMenuResponse_QNAME = new QName("http://pizza_soapws.mycompany.com/", "getFoodMenuResponse");
    private final static QName _SQLException_QNAME = new QName("http://pizza_soapws.mycompany.com/", "SQLException");
    private final static QName _GetSuggestedMenuResponse_QNAME = new QName("http://pizza_soapws.mycompany.com/", "getSuggestedMenuResponse");
    private final static QName _GetDrinkResponse_QNAME = new QName("http://pizza_soapws.mycompany.com/", "getDrinkResponse");
    private final static QName _GetDrinkMenuResponse_QNAME = new QName("http://pizza_soapws.mycompany.com/", "getDrinkMenuResponse");
    private final static QName _GetFoodResponse_QNAME = new QName("http://pizza_soapws.mycompany.com/", "getFoodResponse");
    private final static QName _ClassNotFoundException_QNAME = new QName("http://pizza_soapws.mycompany.com/", "ClassNotFoundException");
    private final static QName _GetDrinkMenu_QNAME = new QName("http://pizza_soapws.mycompany.com/", "getDrinkMenu");
    private final static QName _GetFood_QNAME = new QName("http://pizza_soapws.mycompany.com/", "getFood");
    private final static QName _GetSuggestedMenu_QNAME = new QName("http://pizza_soapws.mycompany.com/", "getSuggestedMenu");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDrinkMenuResponse }
     * 
     */
    public GetDrinkMenuResponse createGetDrinkMenuResponse() {
        return new GetDrinkMenuResponse();
    }

    /**
     * Create an instance of {@link GetDrinkResponse }
     * 
     */
    public GetDrinkResponse createGetDrinkResponse() {
        return new GetDrinkResponse();
    }

    /**
     * Create an instance of {@link GetSuggestedMenuResponse }
     * 
     */
    public GetSuggestedMenuResponse createGetSuggestedMenuResponse() {
        return new GetSuggestedMenuResponse();
    }

    /**
     * Create an instance of {@link SQLException }
     * 
     */
    public SQLException createSQLException() {
        return new SQLException();
    }

    /**
     * Create an instance of {@link GetDrink }
     * 
     */
    public GetDrink createGetDrink() {
        return new GetDrink();
    }

    /**
     * Create an instance of {@link GetFoodMenu }
     * 
     */
    public GetFoodMenu createGetFoodMenu() {
        return new GetFoodMenu();
    }

    /**
     * Create an instance of {@link GetFoodMenuResponse }
     * 
     */
    public GetFoodMenuResponse createGetFoodMenuResponse() {
        return new GetFoodMenuResponse();
    }

    /**
     * Create an instance of {@link GetSuggestedMenu }
     * 
     */
    public GetSuggestedMenu createGetSuggestedMenu() {
        return new GetSuggestedMenu();
    }

    /**
     * Create an instance of {@link GetDrinkMenu }
     * 
     */
    public GetDrinkMenu createGetDrinkMenu() {
        return new GetDrinkMenu();
    }

    /**
     * Create an instance of {@link GetFood }
     * 
     */
    public GetFood createGetFood() {
        return new GetFood();
    }

    /**
     * Create an instance of {@link GetFoodResponse }
     * 
     */
    public GetFoodResponse createGetFoodResponse() {
        return new GetFoodResponse();
    }

    /**
     * Create an instance of {@link ClassNotFoundException }
     * 
     */
    public ClassNotFoundException createClassNotFoundException() {
        return new ClassNotFoundException();
    }

    /**
     * Create an instance of {@link Drink }
     * 
     */
    public Drink createDrink() {
        return new Drink();
    }

    /**
     * Create an instance of {@link Menu }
     * 
     */
    public Menu createMenu() {
        return new Menu();
    }

    /**
     * Create an instance of {@link Food }
     * 
     */
    public Food createFood() {
        return new Food();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pizza_soapws.mycompany.com/", name = "getDrink")
    public JAXBElement<GetDrink> createGetDrink(GetDrink value) {
        return new JAXBElement<GetDrink>(_GetDrink_QNAME, GetDrink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodMenu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pizza_soapws.mycompany.com/", name = "getFoodMenu")
    public JAXBElement<GetFoodMenu> createGetFoodMenu(GetFoodMenu value) {
        return new JAXBElement<GetFoodMenu>(_GetFoodMenu_QNAME, GetFoodMenu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodMenuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pizza_soapws.mycompany.com/", name = "getFoodMenuResponse")
    public JAXBElement<GetFoodMenuResponse> createGetFoodMenuResponse(GetFoodMenuResponse value) {
        return new JAXBElement<GetFoodMenuResponse>(_GetFoodMenuResponse_QNAME, GetFoodMenuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pizza_soapws.mycompany.com/", name = "SQLException")
    public JAXBElement<SQLException> createSQLException(SQLException value) {
        return new JAXBElement<SQLException>(_SQLException_QNAME, SQLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuggestedMenuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pizza_soapws.mycompany.com/", name = "getSuggestedMenuResponse")
    public JAXBElement<GetSuggestedMenuResponse> createGetSuggestedMenuResponse(GetSuggestedMenuResponse value) {
        return new JAXBElement<GetSuggestedMenuResponse>(_GetSuggestedMenuResponse_QNAME, GetSuggestedMenuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pizza_soapws.mycompany.com/", name = "getDrinkResponse")
    public JAXBElement<GetDrinkResponse> createGetDrinkResponse(GetDrinkResponse value) {
        return new JAXBElement<GetDrinkResponse>(_GetDrinkResponse_QNAME, GetDrinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrinkMenuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pizza_soapws.mycompany.com/", name = "getDrinkMenuResponse")
    public JAXBElement<GetDrinkMenuResponse> createGetDrinkMenuResponse(GetDrinkMenuResponse value) {
        return new JAXBElement<GetDrinkMenuResponse>(_GetDrinkMenuResponse_QNAME, GetDrinkMenuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pizza_soapws.mycompany.com/", name = "getFoodResponse")
    public JAXBElement<GetFoodResponse> createGetFoodResponse(GetFoodResponse value) {
        return new JAXBElement<GetFoodResponse>(_GetFoodResponse_QNAME, GetFoodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pizza_soapws.mycompany.com/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrinkMenu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pizza_soapws.mycompany.com/", name = "getDrinkMenu")
    public JAXBElement<GetDrinkMenu> createGetDrinkMenu(GetDrinkMenu value) {
        return new JAXBElement<GetDrinkMenu>(_GetDrinkMenu_QNAME, GetDrinkMenu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pizza_soapws.mycompany.com/", name = "getFood")
    public JAXBElement<GetFood> createGetFood(GetFood value) {
        return new JAXBElement<GetFood>(_GetFood_QNAME, GetFood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuggestedMenu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pizza_soapws.mycompany.com/", name = "getSuggestedMenu")
    public JAXBElement<GetSuggestedMenu> createGetSuggestedMenu(GetSuggestedMenu value) {
        return new JAXBElement<GetSuggestedMenu>(_GetSuggestedMenu_QNAME, GetSuggestedMenu.class, null, value);
    }

}
