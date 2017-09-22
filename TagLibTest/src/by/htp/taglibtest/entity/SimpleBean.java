package by.htp.taglibtest.entity;

import java.util.Date;

public class SimpleBean {
	
	private String name;
	private String surname;
	private Date date;
	
	public SimpleBean() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDate() {
		this.date = new Date();
		return date;
	} 

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
