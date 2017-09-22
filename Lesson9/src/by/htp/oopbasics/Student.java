package by.htp.oopbasics;

public class Student extends Person{

	private String course;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public String doSmthStudent() {
		
		return "I am a student!";
	}
	
	public String saySmth() {
		return "I'm tired!";
	}

	@Override
	public String doSmth() {
		return "I am a student!";
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", toString()=" + super.toString() + "]";
	}
}
