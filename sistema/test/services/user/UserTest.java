package services.user;

import junit.framework.Assert;

import org.hibernate.ObjectNotFoundException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import bo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=false)
@Transactional
public class UserTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void findByIdTest() {
		try {
			Integer idUser = new Integer("5");
			User user = userService.findById(idUser);
			
			Assert.assertNotNull(user);
			Assert.assertEquals(user.getIdUser(), idUser);
		} catch (ObjectNotFoundException e) {
			Assert.fail();
		}
	}
}
