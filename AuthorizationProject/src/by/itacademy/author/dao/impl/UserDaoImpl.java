package by.itacademy.author.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import by.itacademy.author.dao.UserDao;

public class UserDaoImpl implements UserDao{

	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private static final String DB_USER = "root";
	private static final String DB_PASS = "1M2i3g4e5L6";
	private static final String DB_URL = "jdbc:mysql://localhost/auth_data?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=False";
	private static final String SQL_SELECT_NAME = "SELECT name FROM user WHERE name = ? and pass = ?";
	
	Connection con;
	Statement st;
	PreparedStatement ps;
	
	@Override
	public String readName(String login, String pass) {
		String name = null;
		try {
			Class.forName(DB_DRIVER);

			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			ps = con.prepareStatement(SQL_SELECT_NAME);
			ps.setString(1, login);
			ps.setString(2, pass);
		
			ResultSet rs = ps.executeQuery();
			
			while (rs.next() != false) {
				name = rs.getString("name");
			}
				
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return name;
	}

	
	
}
