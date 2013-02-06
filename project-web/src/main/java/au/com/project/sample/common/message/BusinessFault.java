
package au.com.project.sample.common.message;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-11-14T19:46:10.177+11:00
 * Generated source version: 2.5.2
 */

@WebFault(name = "businessException", targetNamespace = "http://www.sample.project.com.au/common/message/BusinessException/v1")
public class BusinessFault extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private au.com.project.sample.common.message.BusinessException businessException;

    public BusinessFault() {
        super();
    }
    
    public BusinessFault(String message) {
        super(message);
    }
    
    public BusinessFault(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessFault(String message, au.com.project.sample.common.message.BusinessException businessException) {
        super(message);
        this.businessException = businessException;
    }

    public BusinessFault(String message, au.com.project.sample.common.message.BusinessException businessException, Throwable cause) {
        super(message, cause);
        this.businessException = businessException;
    }

    public au.com.project.sample.common.message.BusinessException getFaultInfo() {
        return this.businessException;
    }
}
