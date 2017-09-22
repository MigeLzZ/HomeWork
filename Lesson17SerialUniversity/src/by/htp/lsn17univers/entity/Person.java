package by.htp.lsn17univers.entity;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -98760285241679179L;

	public Person() {
		super();
		System.out.println("Person constructor: no parameters");
	}

	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		System.out.println("Person constructor");
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
