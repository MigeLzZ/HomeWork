package by.htp.lsn4;

public class Petal {

	private String shape;
	private String color;
	
	// Используем конструктор.
	public Petal(String shape, String color) {
		this.shape = shape;
		this.color = color;
	}
	
	public String getShape() {
		return shape;
	}
	
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String petalInfo(){
		String info;
		info = "\n" + "Petal shape: " + shape
				+ ", " + "Color: " + color;
		return info;
	}
}
