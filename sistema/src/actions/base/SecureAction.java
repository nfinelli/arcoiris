package actions.base;

import com.opensymphony.xwork2.ActionContext;

import config.Constants;
import bo.User;

public class SecureAction extends BaseAction {
	
	private static final long serialVersionUID = 1L;

	public static final String SECURITY = "security";
	
	private User loguedUser;
	
	public void secureMethod() throws exceptions.SecurityException {

		this.loguedUser = this.getLoguedUser();
		
		if (this.loguedUser == null || this.loguedUser.equals("")){
			
			// Set redirect to
			getSession().put(Constants.SECURITY_REDIRECT, ActionContext.getContext().getName());
			
			addActionError("Para realizar esta operación tenés que ser un usuario registrado y estar logueado!");
			throw new exceptions.SecurityException();
		}

	}

	protected User getLoguedUser() {
		return (User) getSession().get("user");
	}
	
	
}
