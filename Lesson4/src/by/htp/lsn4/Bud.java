package by.htp.lsn4;

public class Bud {

	private double size;
	private String color;
	
	private int lastPetalIndex = 0;
	
	private Petal[] petals;

	public Bud() {
	}
	
	public Bud(double size, String color) {
		this.size = size;
		this.color = color;
	}
		
	public Bud(double size, String color, Petal[] petals) {
		this.size = size;
		this.color = color;
		this.petals = petals;
	}
	
	public Bud(double dize, String color, int petalCount) {
		this.size = size;
		this.color = color;
		
		if(petalCount > 0) {
			this.petals = new Petal[petalCount];
		}
	}

	public double getSize() {
		return size;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	
	public String getColor() {
		return color;
	}	
	

	public void setColor(String color) {
		this.color = color;
	}

	public Petal[] getPetals() {   // Возвращает значение свойства.
		return petals;
	}
	
	public void setPetals(Petal[] petals) {   // Устанавливает значение свойства.
		this.petals = petals;
	}
	
	public String budInfo() {
		String info;
		String petalInfo = "";
		
		for (int i = 0; i < petals.length; i++){
			petalInfo = petalInfo + petals[i].petalInfo();
		}
		
		info = "\n" + "Bud size: " + size
				+ ", " + "Color: " + color
				+ " " + petalInfo;
		return info;
	}
	
	public void addPetal(Petal petal) {
		if (petal != null) {
			
			if(lastPetalIndex < this.petals.length) {
				this.petals[lastPetalIndex] = petal;
				lastPetalIndex++;
			}
		}
	}
}
