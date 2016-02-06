
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

    private final static QName _CreateGoal_QNAME = new QName("http://ws.data.ucoach/", "createGoal");
    private final static QName _DeleteGoal_QNAME = new QName("http://ws.data.ucoach/", "deleteGoal");
    private final static QName _GetGoalsFromUserByHMTypeResponse_QNAME = new QName("http://ws.data.ucoach/", "getGoalsFromUserByHMTypeResponse");
    private final static QName _CreateGoalResponse_QNAME = new QName("http://ws.data.ucoach/", "createGoalResponse");
    private final static QName _DeleteGoalResponse_QNAME = new QName("http://ws.data.ucoach/", "deleteGoalResponse");
    private final static QName _GetGoalsFromUserByHMType_QNAME = new QName("http://ws.data.ucoach/", "getGoalsFromUserByHMType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ucoach.data.internal.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteGoalResponse }
     * 
     */
    public DeleteGoalResponse createDeleteGoalResponse() {
        return new DeleteGoalResponse();
    }

    /**
     * Create an instance of {@link GetGoalsFromUserByHMType }
     * 
     */
    public GetGoalsFromUserByHMType createGetGoalsFromUserByHMType() {
        return new GetGoalsFromUserByHMType();
    }

    /**
     * Create an instance of {@link CreateGoalResponse }
     * 
     */
    public CreateGoalResponse createCreateGoalResponse() {
        return new CreateGoalResponse();
    }

    /**
     * Create an instance of {@link CreateGoal }
     * 
     */
    public CreateGoal createCreateGoal() {
        return new CreateGoal();
    }

    /**
     * Create an instance of {@link DeleteGoal }
     * 
     */
    public DeleteGoal createDeleteGoal() {
        return new DeleteGoal();
    }

    /**
     * Create an instance of {@link GetGoalsFromUserByHMTypeResponse }
     * 
     */
    public GetGoalsFromUserByHMTypeResponse createGetGoalsFromUserByHMTypeResponse() {
        return new GetGoalsFromUserByHMTypeResponse();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link HmType }
     * 
     */
    public HmType createHmType() {
        return new HmType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "createGoal")
    public JAXBElement<CreateGoal> createCreateGoal(CreateGoal value) {
        return new JAXBElement<CreateGoal>(_CreateGoal_QNAME, CreateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "deleteGoal")
    public JAXBElement<DeleteGoal> createDeleteGoal(DeleteGoal value) {
        return new JAXBElement<DeleteGoal>(_DeleteGoal_QNAME, DeleteGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalsFromUserByHMTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "getGoalsFromUserByHMTypeResponse")
    public JAXBElement<GetGoalsFromUserByHMTypeResponse> createGetGoalsFromUserByHMTypeResponse(GetGoalsFromUserByHMTypeResponse value) {
        return new JAXBElement<GetGoalsFromUserByHMTypeResponse>(_GetGoalsFromUserByHMTypeResponse_QNAME, GetGoalsFromUserByHMTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "createGoalResponse")
    public JAXBElement<CreateGoalResponse> createCreateGoalResponse(CreateGoalResponse value) {
        return new JAXBElement<CreateGoalResponse>(_CreateGoalResponse_QNAME, CreateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "deleteGoalResponse")
    public JAXBElement<DeleteGoalResponse> createDeleteGoalResponse(DeleteGoalResponse value) {
        return new JAXBElement<DeleteGoalResponse>(_DeleteGoalResponse_QNAME, DeleteGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalsFromUserByHMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "getGoalsFromUserByHMType")
    public JAXBElement<GetGoalsFromUserByHMType> createGetGoalsFromUserByHMType(GetGoalsFromUserByHMType value) {
        return new JAXBElement<GetGoalsFromUserByHMType>(_GetGoalsFromUserByHMType_QNAME, GetGoalsFromUserByHMType.class, null, value);
    }

}
