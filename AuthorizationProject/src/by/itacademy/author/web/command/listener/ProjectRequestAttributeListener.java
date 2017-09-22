package by.itacademy.author.web.command.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class ProjectRequestAttributeListener implements ServletRequestAttributeListener{

	public ProjectRequestAttributeListener() {
		
	}
	
	public void attributeAdded(ServletRequestAttributeEvent event) {
		System.out.println("Attribute added : " + event.getName() + " = " + event.getValue());
	}
	
	public void attributeRemoved(ServletRequestAttributeEvent event) {
		System.out.println("Attribute removed : " + event.getName() + " = " + event.getValue());
	}
	
	public void attributeReplaced(ServletRequestAttributeEvent event) {
		System.out.println("Attribute replaced : " + event.getName() + " = " + event.getValue());
	}
}
