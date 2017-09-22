package by.itacademy.author.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.itacademy.author.web.command.ActionType;
import by.itacademy.author.web.command.BasicAction;
import by.itacademy.author.web.command.BasicChooser;

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public MainServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.setMaxInactiveInterval(30);

		String command = req.getParameter("command");

		ActionType actionType = ActionType.valueOf(command.toUpperCase());

		BasicAction action = BasicChooser.performAction(actionType);

		String page = action.executeAction(req, resp);

		if (req.getSession(false) != null) {
			if (session.getAttribute("userName") == null) {
				String name = action.executeName(req, resp);
				session.setAttribute("userName", name);
			}
		}
		//String page = proceedRequestHandle(req, resp);
		req.getRequestDispatcher(page).forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.setMaxInactiveInterval(30);

		String command = req.getParameter("command");

		ActionType actionType = ActionType.valueOf(command.toUpperCase());

		BasicAction action = BasicChooser.performAction(actionType);

		String page = action.executeAction(req, resp);

		if (req.getSession(false) != null) {
			if (session.getAttribute("userName") == null) {
				String name = action.executeName(req, resp);
				session.setAttribute("userName", name);
			}
		}
		//String page = proceedRequestHandle(req, resp);
		req.getRequestDispatcher(page).forward(req, resp);
	}

	/*private String proceedRequestHandle(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		HttpSession session = req.getSession();
		session.setMaxInactiveInterval(30);

		String command = req.getParameter("command");

		ActionType actionType = ActionType.valueOf(command.toUpperCase());

		BasicAction action = BasicChooser.performAction(actionType);

		String page = action.executeAction(req, resp);

		if (req.getSession(false) != null) {
			if (session.getAttribute("userName") == null) {
				String name = action.executeName(req, resp);
				session.setAttribute("userName", name);
			}
		}
		return page;
	}*/

}
