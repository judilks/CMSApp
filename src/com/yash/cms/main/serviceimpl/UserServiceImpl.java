package serviceimpl;

import dao.UserDAO;
import daoimpl.UserDAOImpl;
import domain.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService
{

	private UserDAO userDAO;

	public UserServiceImpl() {
		userDAO = new UserDAOImpl();
	}

	public void registerUser(User user) {
		userDAO.insert(user);
	}

	public User authenticateUser(String loginname, String password) {
		User user = null;
		List<User> users = userDAO.list();
		for (User tempUser: users) {
			if(tempUser.getLoginName().equals(loginname) && tempUser.getPassword().equals(password))
				user = tempUser;
		}
		return user;
	}

}
