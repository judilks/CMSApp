package daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import dao.UserDAO;
import domain.User;
import util.DBUtil;

public class UserDAOImpl extends DBUtil implements UserDAO {

	public void insert(User user) {
		String sql = "INSERT INTO USERS (firstName, lastName, loginName, password) VALUES (?,?,?,?)";
		PreparedStatement pstmt = DBUtil.preaparedStatement(sql);
		try {
			pstmt.setString(1, user.getFirstName());
			pstmt.setString(2,user.getLastName());
			pstmt.setString(3, user.getLoginName());
			pstmt.setString(4, user.getPassword());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	public List<User> list() {
		List<User> list = new ArrayList<>();
		String sql = "SELECT * FROM USERS";
		PreparedStatement pstmt = DBUtil.preaparedStatement(sql);
		try{
			ResultSet rs = pstmt.executeQuery();
			while(rs != null && rs.next()){
				User user = new User();
				user.setId(Integer.parseInt(rs.getString("id")));
				user.setFirstName(rs.getString("firstName"));
				user.setLastName(rs.getString("lastName"));
				user.setLoginName(rs.getString("loginName"));
				user.setPassword(rs.getString("password"));
				list.add(user);
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	public User getUser(int id) {
		User user = new User();
		String sql = "SELECT * FROM USERS";
		PreparedStatement pstmt = DBUtil.preaparedStatement(sql);
		try{
			ResultSet rs = pstmt.executeQuery();
			while(rs != null && rs.next()){
			    String tempId = rs.getString("id");
				if(Integer.parseInt(tempId) == id){
					user.setId(Integer.parseInt(rs.getString("id")));
					user.setFirstName(rs.getString("firstName"));
					user.setLastName(rs.getString("lastName"));
					user.setLoginName(rs.getString("loginName"));
					user.setPassword(rs.getString("password"));
				}
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return user;
	}

}
