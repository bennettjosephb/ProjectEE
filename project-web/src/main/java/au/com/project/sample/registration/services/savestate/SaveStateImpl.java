package au.com.project.sample.registration.services.savestate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class SaveStateImpl implements SaveState {

	@Override
	@WebResult(name = "saveStateResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveState/SaveStateResponse/v1", partName = "response")
	@WebMethod(operationName = "SaveState", action = "http://www.sample.project.com.au/registration/services/SaveState/v1")
	public SaveStateResponse saveState(
			@WebParam(partName = "request", name = "saveStateRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveState/SaveStateRequest/v1") SaveStateRequest request)
			throws BusinessFault, TechnicalFault {
		// TODO Auto-generated method stub
		return null;
	}

}
