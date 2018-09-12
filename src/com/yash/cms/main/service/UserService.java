package service;


import domain.User;

public interface UserService {
	
	void registerUser(User user);
	
	User authenticateUser(String loginname, String password);

}
