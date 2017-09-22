package by.itacademy.author.web.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BasicAction {
	
	String executeAction(HttpServletRequest req, HttpServletResponse resp) throws IOException;
	
	String executeName(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
