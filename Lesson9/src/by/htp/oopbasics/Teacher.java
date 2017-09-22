package by.htp.oopbasics;

public class Teacher extends Person{

	private int experience;

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public String doSmthTeacher() {
		
		return "I am a teacher!";
	}

	public String saySmth() {
		return "I'm very tired!";
	}

	@Override  // Аннотация. Если её пишем, то хотим переопределить метод. Будет определяться корректность переопределения.
	public String doSmth() {
		return "I am a teacher!";
	}
}
