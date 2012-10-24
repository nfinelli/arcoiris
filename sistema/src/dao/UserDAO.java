package dao;

import bo.User;
import exceptions.AuthenticationException;

public interface UserDAO {

	/**
	 * Saves a User
	 */
	public Integer save(User user);
	
	/**
	 * Updates a User
	 */
	public void update(User user);
	
	/**
	 * Authenticates a User
	 */
	public User authenticate(String email, String password) throws AuthenticationException;
	
	/**
	 * Find a User by email
	 */
	public User findByEmail(String email);
	
	/**
	 * Find a User by id
	 */
	public User findById(Integer id);
}
