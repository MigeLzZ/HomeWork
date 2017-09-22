package by.htp.lsn4;

public class Flower {

	private double height;
	private String title; // String - это ссылочный тип, по этому значение по умолчанию null.
	private Bud bud;      // Ссылочная переменная по умолчанию принимает значение null.
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Bud getBud() {
		return bud;
	}

	public void setBud(Bud bud) {
		this.bud = bud;
	}

	public Flower(double height, String title, Bud bud) {
		this.height = height;
		this.title = title;
		this.bud = bud;
	}
	
	public Flower(double height, String title) {
		this.height = height;
		this.title = title;
	}

	public Flower() {
	}
	
	public String flowerInfo() {  
		String info;
		info = "Flower height: " + height 
				+ ", " + "Title: " + title;
		if(bud != null) {
			info = info + bud.budInfo();
		}
		return info;
	}
	
	public void toBloom() {
		if (this.bud == null){
			
			Bud bud = new Bud(15, "Red", 3);
			//bud.setSize(15);
			//bud.setColor("Red");
			
			Petal petal1 = new Petal("Oval", "Pink");
			Petal petal2 = new Petal("Oval", "Pink");
			Petal petal3 = new Petal("Oval", "Pink");
			
			Petal petal4 = new Petal("Oval", "Pink");
			
			bud.addPetal(petal1);
			bud.addPetal(petal2);
			bud.addPetal(petal3);
			
			bud.addPetal(petal4);
			
			this.bud = bud;
			
		} else {
			double oldSize = this.bud.getSize();
			double newSize = oldSize * 2;
			bud.setSize(newSize);
		}
	}
}
