
package ucoach.data.internal.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserInterface", targetNamespace = "http://ws.data.ucoach/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserInterface {


    /**
     * 
     * @param user
     */
    @WebMethod
    @RequestWrapper(localName = "createUser", targetNamespace = "http://ws.data.ucoach/", className = "ucoach.data.internal.ws.CreateUser")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://ws.data.ucoach/", className = "ucoach.data.internal.ws.CreateUserResponse")
    @Action(input = "http://ws.data.ucoach/UserInterface/createUserRequest", output = "http://ws.data.ucoach/UserInterface/createUserResponse")
    public void createUser(
        @WebParam(name = "user", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<User> user);

    /**
     * 
     * @param user
     * @return
     *     returns ucoach.data.internal.ws.User
     */
    @WebMethod
    @WebResult(name = "updateUser", targetNamespace = "")
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://ws.data.ucoach/", className = "ucoach.data.internal.ws.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://ws.data.ucoach/", className = "ucoach.data.internal.ws.UpdateUserResponse")
    @Action(input = "http://ws.data.ucoach/UserInterface/updateUserRequest", output = "http://ws.data.ucoach/UserInterface/updateUserResponse")
    public User updateUser(
        @WebParam(name = "user", targetNamespace = "")
        User user);

    /**
     * 
     * @param userId
     */
    @WebMethod
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://ws.data.ucoach/", className = "ucoach.data.internal.ws.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://ws.data.ucoach/", className = "ucoach.data.internal.ws.DeleteUserResponse")
    @Action(input = "http://ws.data.ucoach/UserInterface/deleteUserRequest", output = "http://ws.data.ucoach/UserInterface/deleteUserResponse")
    public void deleteUser(
        @WebParam(name = "userId", targetNamespace = "")
        int userId);

    /**
     * 
     * @param userId
     * @return
     *     returns ucoach.data.internal.ws.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://ws.data.ucoach/", className = "ucoach.data.internal.ws.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://ws.data.ucoach/", className = "ucoach.data.internal.ws.GetUserResponse")
    @Action(input = "http://ws.data.ucoach/UserInterface/getUserRequest", output = "http://ws.data.ucoach/UserInterface/getUserResponse")
    public User getUser(
        @WebParam(name = "userId", targetNamespace = "")
        int userId);

}
