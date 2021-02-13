
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

    private final static QName _ClassNotFoundException_QNAME = new QName("http://movie_soapws.mycompany.com/", "ClassNotFoundException");
    private final static QName _GetDirectorResponse_QNAME = new QName("http://movie_soapws.mycompany.com/", "getDirectorResponse");
    private final static QName _GetMoviesResponse_QNAME = new QName("http://movie_soapws.mycompany.com/", "getMoviesResponse");
    private final static QName _SQLException_QNAME = new QName("http://movie_soapws.mycompany.com/", "SQLException");
    private final static QName _GetDirector_QNAME = new QName("http://movie_soapws.mycompany.com/", "getDirector");
    private final static QName _GetMovies_QNAME = new QName("http://movie_soapws.mycompany.com/", "getMovies");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMovies }
     * 
     */
    public GetMovies createGetMovies() {
        return new GetMovies();
    }

    /**
     * Create an instance of {@link GetMoviesResponse }
     * 
     */
    public GetMoviesResponse createGetMoviesResponse() {
        return new GetMoviesResponse();
    }

    /**
     * Create an instance of {@link SQLException }
     * 
     */
    public SQLException createSQLException() {
        return new SQLException();
    }

    /**
     * Create an instance of {@link GetDirector }
     * 
     */
    public GetDirector createGetDirector() {
        return new GetDirector();
    }

    /**
     * Create an instance of {@link ClassNotFoundException }
     * 
     */
    public ClassNotFoundException createClassNotFoundException() {
        return new ClassNotFoundException();
    }

    /**
     * Create an instance of {@link GetDirectorResponse }
     * 
     */
    public GetDirectorResponse createGetDirectorResponse() {
        return new GetDirectorResponse();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link Director }
     * 
     */
    public Director createDirector() {
        return new Director();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movie_soapws.mycompany.com/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDirectorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movie_soapws.mycompany.com/", name = "getDirectorResponse")
    public JAXBElement<GetDirectorResponse> createGetDirectorResponse(GetDirectorResponse value) {
        return new JAXBElement<GetDirectorResponse>(_GetDirectorResponse_QNAME, GetDirectorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movie_soapws.mycompany.com/", name = "getMoviesResponse")
    public JAXBElement<GetMoviesResponse> createGetMoviesResponse(GetMoviesResponse value) {
        return new JAXBElement<GetMoviesResponse>(_GetMoviesResponse_QNAME, GetMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movie_soapws.mycompany.com/", name = "SQLException")
    public JAXBElement<SQLException> createSQLException(SQLException value) {
        return new JAXBElement<SQLException>(_SQLException_QNAME, SQLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDirector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movie_soapws.mycompany.com/", name = "getDirector")
    public JAXBElement<GetDirector> createGetDirector(GetDirector value) {
        return new JAXBElement<GetDirector>(_GetDirector_QNAME, GetDirector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movie_soapws.mycompany.com/", name = "getMovies")
    public JAXBElement<GetMovies> createGetMovies(GetMovies value) {
        return new JAXBElement<GetMovies>(_GetMovies_QNAME, GetMovies.class, null, value);
    }

}
