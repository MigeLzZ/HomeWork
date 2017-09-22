package by.itacademy.author.web.command.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.itacademy.author.dao.impl.AbstractDao;
import by.itacademy.author.service.UserService;
import by.itacademy.author.service.impl.UserServiceImpl;
import by.itacademy.author.web.command.BasicAction;

public class LoginActionImpl extends AbstractDao implements BasicAction{
	
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private static final String DB_USER = "root";
	private static final String DB_PASS = "1M2i3g4e5L6";
	private static final String DB_URL = "jdbc:mysql://localhost/auth_data?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=False";
	private static final String SELECT_FROM_USER = "SELECT name, pass, adm FROM user WHERE name = ? and pass = ?";
	

	@Override
	public String executeAction(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		String page = "";
		String login = req.getParameter("name");
		String pass = req.getParameter("pass");
		String adminSet = "";
		
		System.out.println(login + " " + pass);
		Connection cn = null;
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			Class.forName(DB_DRIVER);
			cn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			
			ps = cn.prepareStatement(SELECT_FROM_USER);			
			ps.setString(1, login);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				
				adminSet = rs.getString(3);
				if (adminSet.equals("0")) {
					page = "/jsp/user/user.jsp";
				} else {
					page = "/jsp/admin/admin.jsp";
				} 
			}else if (rs.next() == false) {
				page = "/jsp/error.jsp";
				}			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			closeConnection(cn);
		}
		return page;
	}


	@Override
	public String executeName(HttpServletRequest request, HttpServletResponse response) throws IOException {
		UserService service = new UserServiceImpl();
		String login = request.getParameter("name");
		String pass = request.getParameter("pass");
		String name = service.getName(login, pass);
		return name;
	}
}
