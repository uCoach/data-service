
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

    private final static QName _GetGoalsFromUserByTypeAndStatusResponse_QNAME = new QName("http://ws.data.ucoach/", "getGoalsFromUserByTypeAndStatusResponse");
    private final static QName _AchieveGoalResponse_QNAME = new QName("http://ws.data.ucoach/", "achieveGoalResponse");
    private final static QName _CreateGoal_QNAME = new QName("http://ws.data.ucoach/", "createGoal");
    private final static QName _DeleteGoal_QNAME = new QName("http://ws.data.ucoach/", "deleteGoal");
    private final static QName _GetGoalsFromUserByType_QNAME = new QName("http://ws.data.ucoach/", "getGoalsFromUserByType");
    private final static QName _AchieveGoal_QNAME = new QName("http://ws.data.ucoach/", "achieveGoal");
    private final static QName _CreateGoalResponse_QNAME = new QName("http://ws.data.ucoach/", "createGoalResponse");
    private final static QName _DeleteGoalResponse_QNAME = new QName("http://ws.data.ucoach/", "deleteGoalResponse");
    private final static QName _GetGoalsFromUserByTypeAndStatus_QNAME = new QName("http://ws.data.ucoach/", "getGoalsFromUserByTypeAndStatus");
    private final static QName _GetGoalsFromUserByTypeResponse_QNAME = new QName("http://ws.data.ucoach/", "getGoalsFromUserByTypeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ucoach.data.internal.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetGoalsFromUserByTypeAndStatus }
     * 
     */
    public GetGoalsFromUserByTypeAndStatus createGetGoalsFromUserByTypeAndStatus() {
        return new GetGoalsFromUserByTypeAndStatus();
    }

    /**
     * Create an instance of {@link GetGoalsFromUserByTypeResponse }
     * 
     */
    public GetGoalsFromUserByTypeResponse createGetGoalsFromUserByTypeResponse() {
        return new GetGoalsFromUserByTypeResponse();
    }

    /**
     * Create an instance of {@link DeleteGoalResponse }
     * 
     */
    public DeleteGoalResponse createDeleteGoalResponse() {
        return new DeleteGoalResponse();
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
     * Create an instance of {@link GetGoalsFromUserByType }
     * 
     */
    public GetGoalsFromUserByType createGetGoalsFromUserByType() {
        return new GetGoalsFromUserByType();
    }

    /**
     * Create an instance of {@link AchieveGoalResponse }
     * 
     */
    public AchieveGoalResponse createAchieveGoalResponse() {
        return new AchieveGoalResponse();
    }

    /**
     * Create an instance of {@link GetGoalsFromUserByTypeAndStatusResponse }
     * 
     */
    public GetGoalsFromUserByTypeAndStatusResponse createGetGoalsFromUserByTypeAndStatusResponse() {
        return new GetGoalsFromUserByTypeAndStatusResponse();
    }

    /**
     * Create an instance of {@link AchieveGoal }
     * 
     */
    public AchieveGoal createAchieveGoal() {
        return new AchieveGoal();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalsFromUserByTypeAndStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "getGoalsFromUserByTypeAndStatusResponse")
    public JAXBElement<GetGoalsFromUserByTypeAndStatusResponse> createGetGoalsFromUserByTypeAndStatusResponse(GetGoalsFromUserByTypeAndStatusResponse value) {
        return new JAXBElement<GetGoalsFromUserByTypeAndStatusResponse>(_GetGoalsFromUserByTypeAndStatusResponse_QNAME, GetGoalsFromUserByTypeAndStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AchieveGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "achieveGoalResponse")
    public JAXBElement<AchieveGoalResponse> createAchieveGoalResponse(AchieveGoalResponse value) {
        return new JAXBElement<AchieveGoalResponse>(_AchieveGoalResponse_QNAME, AchieveGoalResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalsFromUserByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "getGoalsFromUserByType")
    public JAXBElement<GetGoalsFromUserByType> createGetGoalsFromUserByType(GetGoalsFromUserByType value) {
        return new JAXBElement<GetGoalsFromUserByType>(_GetGoalsFromUserByType_QNAME, GetGoalsFromUserByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AchieveGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "achieveGoal")
    public JAXBElement<AchieveGoal> createAchieveGoal(AchieveGoal value) {
        return new JAXBElement<AchieveGoal>(_AchieveGoal_QNAME, AchieveGoal.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalsFromUserByTypeAndStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "getGoalsFromUserByTypeAndStatus")
    public JAXBElement<GetGoalsFromUserByTypeAndStatus> createGetGoalsFromUserByTypeAndStatus(GetGoalsFromUserByTypeAndStatus value) {
        return new JAXBElement<GetGoalsFromUserByTypeAndStatus>(_GetGoalsFromUserByTypeAndStatus_QNAME, GetGoalsFromUserByTypeAndStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalsFromUserByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.data.ucoach/", name = "getGoalsFromUserByTypeResponse")
    public JAXBElement<GetGoalsFromUserByTypeResponse> createGetGoalsFromUserByTypeResponse(GetGoalsFromUserByTypeResponse value) {
        return new JAXBElement<GetGoalsFromUserByTypeResponse>(_GetGoalsFromUserByTypeResponse_QNAME, GetGoalsFromUserByTypeResponse.class, null, value);
    }

}
