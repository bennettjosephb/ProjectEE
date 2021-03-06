package au.com.project.sample.registration.services.deletecountry;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-02-05T13:42:26.456+11:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://www.sample.project.com.au/registration/services/DeleteCountry/v1", name = "DeleteCountry")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DeleteCountry {

    @WebResult(name = "deleteCountryResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/DeleteCountry/v1", partName = "response")
    @WebMethod(operationName = "DeleteCountry", action = "http://www.sample.project.com.au/registration/services/DeleteCountry/v1")
    public au.com.project.sample.registration.services.deletecountry.DeleteCountryResponse deleteCountry(
        @WebParam(partName = "request", name = "deleteCountryRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/DeleteCountry/v1")
        au.com.project.sample.registration.services.deletecountry.DeleteCountryRequest request
    ) throws au.com.project.sample.common.message.BusinessFault, au.com.project.sample.common.message.TechnicalFault;
}
