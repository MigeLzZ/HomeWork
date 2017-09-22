package by.itacademy.author.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BasicAction {
	
	String executeAction(HttpServletRequest req, HttpServletResponse resp);
}
