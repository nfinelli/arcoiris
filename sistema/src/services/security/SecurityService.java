package services.security;

import services.user.UserService;

import exceptions.AuthenticationException;
import bo.User;

public class SecurityService {
	
	UserService userService;

	/**
	 * User authentication
	 * @param email
	 * @param password
	 * @return User
	 * @throws AuthenticationException
	 */
	public User authenticate(String email, String password) throws AuthenticationException {
    
		User user = userService.authenticate(email,password);
    
		if (user == null){
			throw new AuthenticationException("Invalid password");
		}
		return user;
	}
	

	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
