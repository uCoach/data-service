
package ucoach.data.internal.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ucoach.data.internal.ws package. 
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

    private final static QName _GetCoachResponse_QNAME = new QName("http://ws.data.ucoach/", "getCoachResponse");
    private final static QName _DeleteCoach_QNAME = new QName("http://ws.data.ucoach/", "deleteCoach");
    private final static QName _CreateCoach_QNAME = new QName("http://ws.data.ucoach/", "createCoach");
    private final static QName _UpdateCoachResponse_QNAME = new QName("http://ws.data.ucoach/", "updateCoachResponse");
    private final static QName _DeleteCoachResponse_QNAME = new QName("http://ws.data.ucoach/", "deleteCoachResponse");
    private final static QName _CreateCoachResponse_QNAME = new QName("http://ws.data.ucoach/", "createCoachResponse");
    private final static QName _GetCoach_QNAME = new QName("http://ws.data.ucoach/", "getCoach");
    private final static QName _UpdateCoach_QNAME = new QName("http://ws.data.ucoach/", "updateCoach");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ucoach.data.internal.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateCoachResponse }
     * 
     */
    public CreateCoachResponse createCreateCoachResponse() {
        return new CreateCoachResponse();
    }

    /**
     * Create an instance of {@link GetCoach }
     * 
     */
    public GetCoach createGetCoach() {
        return new GetCoach();
    }

    /**
     * Create an instance of {@link UpdateCoach }
     * 
     */
    public UpdateCoach createUpdateCoach() {
        return new UpdateCoach();
    }

    /**
     * Create an instance of {@link CreateCoach }
     * 
     */
    public CreateCoach createCreateCoach() {
        return new CreateCoach();
    }

    /**
     * Create an instance of {@link DeleteCoach }
     * 
     */
    public DeleteCoach createDeleteCoach() {
        return new DeleteCoach();
    }

    /**
     * Create an instance of {@link GetCoachResponse }
     * 
     */
    public GetCoachResponse createGetCoachResponse() {
        return new GetCoachResponse();
    }

    /**
     * Create an instance of {@link DeleteCoachResponse }
     * 
     */
    public DeleteCoachResponse createDeleteCoachResponse() {
        return new DeleteCoachResponse();
    }

    /**
     * Create an instance of {@link UpdateCoachResponse }
     * 
     */
    public UpdateCoachResponse createUpdateCoachResponse() {
        return new UpdateCoachResponse();
    }

    /**
     * Create an instance of {@link Coach }
     * 
     */
    public Coach createCoach() {
        return new Coach();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCoachResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "getCoachResponse")
    public JAXBElement<GetCoachResponse> createGetCoachResponse(GetCoachResponse value) {
        return new JAXBElement<GetCoachResponse>(_GetCoachResponse_QNAME, GetCoachResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCoach }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "deleteCoach")
    public JAXBElement<DeleteCoach> createDeleteCoach(DeleteCoach value) {
        return new JAXBElement<DeleteCoach>(_DeleteCoach_QNAME, DeleteCoach.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCoach }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "createCoach")
    public JAXBElement<CreateCoach> createCreateCoach(CreateCoach value) {
        return new JAXBElement<CreateCoach>(_CreateCoach_QNAME, CreateCoach.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCoachResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "updateCoachResponse")
    public JAXBElement<UpdateCoachResponse> createUpdateCoachResponse(UpdateCoachResponse value) {
        return new JAXBElement<UpdateCoachResponse>(_UpdateCoachResponse_QNAME, UpdateCoachResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCoachResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "deleteCoachResponse")
    public JAXBElement<DeleteCoachResponse> createDeleteCoachResponse(DeleteCoachResponse value) {
        return new JAXBElement<DeleteCoachResponse>(_DeleteCoachResponse_QNAME, DeleteCoachResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCoachResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "createCoachResponse")
    public JAXBElement<CreateCoachResponse> createCreateCoachResponse(CreateCoachResponse value) {
        return new JAXBElement<CreateCoachResponse>(_CreateCoachResponse_QNAME, CreateCoachResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCoach }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "getCoach")
    public JAXBElement<GetCoach> createGetCoach(GetCoach value) {
        return new JAXBElement<GetCoach>(_GetCoach_QNAME, GetCoach.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCoach }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "updateCoach")
    public JAXBElement<UpdateCoach> createUpdateCoach(UpdateCoach value) {
        return new JAXBElement<UpdateCoach>(_UpdateCoach_QNAME, UpdateCoach.class, null, value);
    }

}
