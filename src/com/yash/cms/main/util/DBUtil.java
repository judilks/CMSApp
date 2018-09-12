package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * This class will represent all the db related common functionalities. 
 * like :  connection, getting prepared statement object, closing preparestatement and connection
 * @author sharma.pankaj
 *
 */
public class DBUtil {
	
	private static String driverClassName = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/work";
	private static String userName= "root";
	private static String password = "root";
	private static Connection con=null;
	private static PreparedStatement pstmt = null;
	
	public DBUtil() {
		try {
			Class c = Class.forName(driverClassName);
			System.out.println(c);
		} catch (ClassNotFoundException e) {
			System.out.println("------->"+e.getMessage());
		}
	}
	
	private static Connection connect(){
		
		try {
			con= DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static PreparedStatement preaparedStatement(String sql){
		try {
			pstmt = connect().prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pstmt;
	}
	
	public static void closeConnection(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void closePreparedStatement(){
		try {
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
