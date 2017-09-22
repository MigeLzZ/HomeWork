package by.itacademy.catalog.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademy.catalog.domain.entity.Book;
import by.itacademy.catalog.domain.vo.Catalog;
import by.itacademy.catalog.service.CatalogService;
import by.itacademy.catalog.service.impl.SimpleCatalogImpl;
import by.itacademy.catalog.web.command.ActionType;
import by.itacademy.catalog.web.command.BasicAction;
import by.itacademy.catalog.web.command.CommandChooser;

public class MainServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private int requestCount = 0;
	
	private CatalogService service;
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
		System.out.println("service method: " + requestCount);
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("destroy method: " + requestCount);
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init method: " + requestCount);
		service = new SimpleCatalogImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		requestCount++;
		
		String command = request.getParameter("command");
		System.out.println(command);
		
		ActionType action = ActionType.valueOf(command.toUpperCase());
		BasicAction basicAction = CommandChooser.performAction(action);  // Мы определяем объект какого класса реализует данный интерфейс.
		basicAction.executeAction(request, response);	
	}	
}
