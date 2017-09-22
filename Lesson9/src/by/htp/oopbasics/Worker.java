package by.htp.oopbasics;

public class Worker extends Person{
	
	private String speciality;

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public String doSmthWorker() {
		
		return "I am a worker!";
	}
	
	public String saySmth() {
		return "I'm angry!";
	}

	@Override
	public String doSmth() {
		return "I am a worker!";
	}

	@Override
	public String toString() {
		return "Worker [speciality=" + speciality + ", getFio()=" + getFio() + ", getAge()=" + getAge() + "]";
	}
}
