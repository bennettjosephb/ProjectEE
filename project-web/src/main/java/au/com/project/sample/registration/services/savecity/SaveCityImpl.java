package au.com.project.sample.registration.services.savecity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;
import au.com.project.sample.process.CityController;

public class SaveCityImpl implements SaveCity {
	
	private CityController cityController;
	

	@Override
	@WebResult(name = "saveCityResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCity/SaveCityResponse/v1", partName = "response")
	@WebMethod(operationName = "SaveCity", action = "http://www.sample.project.com.au/registration/services/SaveCity/v1")
	public SaveCityResponse saveCity(
			@WebParam(partName = "request", name = "saveCityRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCity/SaveCityRequest/v1") SaveCityRequest request)
			throws TechnicalFault, BusinessFault {
		// TODO Auto-generated method stub
		
		return null;
	}


	public CityController getCityController() {
		return cityController;
	}


	public void setCityController(CityController cityController) {
		this.cityController = cityController;
	}

}
