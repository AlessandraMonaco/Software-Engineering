
package soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSInterface", targetNamespace = "http://movie_soapws.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSInterface {


    /**
     * 
     * @param arg0
     * @return
     *     returns soap.Director
     * @throws ClassNotFoundException_Exception
     * @throws SQLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDirector", targetNamespace = "http://movie_soapws.mycompany.com/", className = "soap.GetDirector")
    @ResponseWrapper(localName = "getDirectorResponse", targetNamespace = "http://movie_soapws.mycompany.com/", className = "soap.GetDirectorResponse")
    public Director getDirector(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws ClassNotFoundException_Exception, SQLException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<soap.Movie>
     * @throws ClassNotFoundException_Exception
     * @throws SQLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMovies", targetNamespace = "http://movie_soapws.mycompany.com/", className = "soap.GetMovies")
    @ResponseWrapper(localName = "getMoviesResponse", targetNamespace = "http://movie_soapws.mycompany.com/", className = "soap.GetMoviesResponse")
    public List<Movie> getMovies()
        throws ClassNotFoundException_Exception, SQLException_Exception
    ;

}
