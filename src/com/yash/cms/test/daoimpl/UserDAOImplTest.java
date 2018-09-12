package daoimpl;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.List;

import dao.UserDAO;
import domain.User;
import org.junit.Test;


public class UserDAOImplTest {
	
	@Test
	public void testInsert_UserGiven_ShouldAddUserRecordInDB() throws Exception {
		UserDAO userDAO=new UserDAOImpl();
		User user =  new User();
		user.setFirstName("lalu");
		user.setLastName("shaik");
		user.setLoginName("lalu");
		user.setPassword("lalu123");
		userDAO.insert(user);
	}

    @Test
    public void testGetUser_IdGiven_ShouldReturnUserFromDB() throws Exception {
        UserDAO userDAO=new UserDAOImpl();
        User user = userDAO.getUser(9);
        assertEquals(user.getLoginName(), "lalu");
    }

    @Test
    public void testListUser_NotihingGiven_ShouldReturnUserListFromDB() throws Exception {
        User user =  new User();
        user.setFirstName("lalu");
        user.setLastName("shaik");
        user.setLoginName("lalu");
        user.setPassword("lalu123");
        UserDAO userDAO=new UserDAOImpl();
        List<User> users = userDAO.list();
        assertEquals(users.get(0).getLoginName(), "lalu");
    }


	
	

}
