package actions.example;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import actions.base.SecureAction;

public class ExampleAction extends SecureAction implements ServletContextAware {

	private static final long serialVersionUID = 1L;
	
	private ServletContext context;
	
	/**
	 * ---- EXAMPLE ----
	 */
	/*
	public String editBusinessInit(){
		try {
			secureMethod();
		}catch (SecurityException e){
			return SECURITY;
		}

		// CODE 
		// ...
		// ... 
		
 
		return Constants.BUSINESS_EDIT_HOME;
	}
	*/
	

	public void setServletContext(ServletContext context) {
		this.context = context;
	}
}