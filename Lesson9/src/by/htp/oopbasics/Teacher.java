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

	@Override  // ���������. ���� � �����, �� ����� �������������� �����. ����� ������������ ������������ ���������������.
	public String doSmth() {
		return "I am a teacher!";
	}
}
