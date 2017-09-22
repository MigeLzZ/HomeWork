package by.htp.taglibtest.web.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.htp.taglibtest.entity.User;
import by.htp.taglibtest.entity.UserRole;

public class MainServlet extends HttpServlet {
	
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private static final String DB_USER = "root";
	private static final String DB_PASS = "1M2i3g4e5L6";
	private static final String DB_URL = "jdbc:mysql://localhost/bookcatalog?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=False";
	
	private static final String SQL_SELECT_BOOKS = "SELECT id, title FROM book";
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.setAttribute("local", Locale.US);
		
		String action = request.getParameter("action");
		Connection cn = null;
		Statement st = null;
		
		//PreparedStatement ps = null;
		ResultSet rs = null;
		
		if (action != null) {
			switch (action) {
			case "login":
				String login = request.getParameter("login");
				String password = request.getParameter("pass");

				if (login.equals("user") && password.equals("user")) {
					List<String> list = new ArrayList<String>();
					list.add("one");
					list.add("two");
					list.add("three");
					list.add("four");
					
					HashSet<User> userSet = new HashSet<User>();
					userSet.add(new User(1, "User1", UserRole.ADMIN));
					userSet.add(new User(2, "User2", UserRole.GUEST));
					userSet.add(new User(3, "User3", UserRole.USER));
					
					/*try {
						Class.forName(DB_DRIVER);
						cn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
						st = cn.createStatement();
						rs = st.executeQuery(SQL_SELECT_BOOKS);
						if (rs.next()) {
							List<String> list = new ArrayList<String>();
							//String s = rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3);
							for(int i = 0; i < list.size(); i ++) {
								list.add(rs.getInt(1), rs.getString(2));
								System.out.println(list);
							}
							
						}
					} catch (SQLException e) {
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}*/
					request.setAttribute("userSetParam", userSet);
					//request.setAttribute("numbers", list);
					request.getRequestDispatcher("/jsp/user.jsp").forward(request, response);
				}

				if (login.equals("admin") & password.equals("admin")) {
					List<String> list1 = new ArrayList<String>();
					list1.add("five");
					list1.add("six");
					list1.add("seven");
					list1.add("eight");

					request.setAttribute("numbers1", list1);
					request.getRequestDispatcher("/jsp/admin.jsp").forward(request, response);
				}
				
				if (login.equals("1") && password.equals("1")) {
					
					ResourceBundle rb = ResourceBundle.getBundle("config");
					String msg = rb.getString("sample.string.servlet");
					String count = rb.getString("sample.string.servlet.number");
					if (count != null) {
						int max = Integer.parseInt(count);
						for (int i = 0; i < max; i ++) {
							System.out.println(msg + i);
						}
					}
				}
				break;
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
