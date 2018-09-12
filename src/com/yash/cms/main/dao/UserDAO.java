package dao;

import java.util.List;

import domain.User;

public interface UserDAO {
	
	void insert(User user);
	
	void delete(int id);
	
	void update(User user);
	
	List<User> list();
	
	User getUser(int id);

}
