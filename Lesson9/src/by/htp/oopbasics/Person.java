package by.htp.oopbasics;

public abstract class Person {
	
	private String fio;  // Private запрещает прямой доступ, но не наследование.
	private int age;
	
	public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*public String doSmth() {
		
		return "I am a person!";
	}
	
	public String saySmth() {
		return "I'm hungry!";
	} */
	
	public abstract String doSmth();
	public abstract String saySmth();
	
	public void doSmth2() {
		System.out.println("do2");
	}
	
	@Override
	public String toString() {
		return "Person [fio=" + fio + ", age=" + age + "]";
	}
}
