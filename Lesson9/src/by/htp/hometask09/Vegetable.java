package by.htp.hometask09;

public abstract class Vegetable {
	private int cal;
	private String name;
	
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String doSmth();
}
