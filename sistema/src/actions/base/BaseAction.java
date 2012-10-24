package actions.base;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

  
public class BaseAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	
	private String redirect;
	
	private Map<String,Object> session;
	
	@SuppressWarnings("unused")	
	private Logger logger;
		
	protected void setRedirect(String r){
		this.redirect = r;
	}
	
	public String getRedirect(){
		
//		 if (this.redirect == null) {
//			return Constants.BUSINESS_VIEW;
//		}
		return this.redirect;
		
		
		
	}
	
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	  
	public Map<String,Object> getSession() {
	    return session;
	}

	public Logger getLogger() {
		return LoggerFactory.getLogger(this.getClass());
	}
	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}