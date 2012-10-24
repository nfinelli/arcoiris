package services.user;

import javax.persistence.NoResultException;

import org.springframework.transaction.annotation.Transactional;

import util.SecurityUtils;
import bo.User;
import dao.UserDAO;
import exceptions.AuthenticationException;



@Transactional
public class UserService {
	
	UserDAO userDAO;
	
	/**
	 * Authenticates user in database
	 * @param email
	 * @param password
	 * @return User
	 */
	public User authenticate(String email, String password) throws AuthenticationException {
		// Makes sha-1 hash
		password = SecurityUtils.toSha1(password);
		
		return userDAO.authenticate(email, password);
	}


	/**
	 * Finds a user by id
	 * @param id the user ID
	 * @return the user
	 */
	public User findById(Integer id) throws NoResultException {
		return userDAO.findById(id);
	}
	
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}