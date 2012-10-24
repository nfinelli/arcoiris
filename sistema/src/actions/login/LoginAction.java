package actions.login;

import config.Constants;
import bo.User;
import services.security.SecurityService;
import util.ValidationUtils;
import dto.UserDTO;
import exceptions.AuthenticationException;
import actions.base.BaseAction;

public class LoginAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private SecurityService securityService;
	
	private UserDTO userDTO;

	private String redirectTo;
	
	/**
	 * Validates login
	 */
	private boolean loginValidate() {
		if (!ValidationUtils.isEmail(userDTO.getEmail(), true)) {
			addFieldError("userDTO.email", "Debes ingresar un email válido");
		}
		if (userDTO.getPassword() == null || userDTO.getPassword().equals("")) {
			addFieldError("userDTO.password", "Debes ingresar un password");
		}
		if (hasFieldErrors()){
			return true;
		}
		return false;
	}
	
	
	/**
	 * Goto login page
	 */
	public String init(){
		return Constants.LOGIN_HOME;
	}
	
	/**
	 * User authentication - login
	 */
	public String authenticate() {
		
		// Validation
		boolean hasErrors = loginValidate();
		if (hasErrors) { return INPUT; }
		
		try {
			// User login
			User user = securityService.authenticate(userDTO.getEmail(), userDTO.getPassword());
			getSession().put("user",user);
		}catch (AuthenticationException e){
			addActionError("Usuario o contraseña incorrectos!");
			return INPUT;
		}
		
		redirectTo = (String) getSession().get(Constants.SECURITY_REDIRECT);
		if (redirectTo != null) {
			getSession().put(Constants.SECURITY_REDIRECT, null);
			return "redirectTo";
		}
		return SUCCESS;
	}


	/**
	 * User logout
	 */
	public String logout(){
		getSession().remove("user");
		addActionMessage("Saliste correctamente!");
		return SUCCESS;
	}
	
	
	public SecurityService getSecurityService() {
		return securityService;
	}
	public void setSecurityService(SecurityService securityService) {
		this.securityService = securityService;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	public String getRedirectTo() {
		return redirectTo;
	}
	public void setRedirectTo(String redirectTo) {
		this.redirectTo = redirectTo;
	}
}
