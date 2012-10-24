package dao.impl;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bo.User;
import dao.UserDAO;
import exceptions.AuthenticationException;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
	
	
	public Integer save(User user){
		return (Integer) getHibernateTemplate().save(user);
	}
	
	public void update(User user) {
		getHibernateTemplate().update(user);
	}
	
	@SuppressWarnings("unchecked")
	public User authenticate(String email, String password) throws AuthenticationException{
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		criteria.add(Restrictions.eq("email",email));
		criteria.add(Restrictions.eq("password",password));
		
		List<User> userList = (List<User>) getHibernateTemplate().findByCriteria(criteria);
		
		if (userList!=null && !userList.isEmpty()){
			return userList.get(0);
		}else{
			throw new AuthenticationException();
		}
	}
	
	@SuppressWarnings("unchecked")
	public User findByEmail(String email) {
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		criteria.add(Restrictions.eq("email",email));
		
		List<User> userList = (List<User>) getHibernateTemplate().findByCriteria(criteria);
		if (userList!= null && !userList.isEmpty()){
			return userList.get(0);
		}else{
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public User findById(Integer id) throws NoResultException {
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		criteria.add(Restrictions.eq("idUser", id));
		
		List<User> users = getHibernateTemplate().findByCriteria(criteria);
		if (users.get(0)==null) {
			throw new NoResultException();
		} 
		return users.get(0);
	}
}
