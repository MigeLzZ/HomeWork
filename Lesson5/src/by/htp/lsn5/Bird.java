package by.htp.lsn5;

public class Bird {

	public String species;  // Вид, разновидность.
	public String hp;   // Тип птицы: хищная или травоядная - predator or herbivorous.
	public String color;
	public Wing wing;
	public Beak beak;
	
	public Bird(String species, String hp, String color, Wing wing, Beak beak) {
		this.species = species;
		this.hp = hp;
		this.color = color;
		this.wing = wing;
		this.beak = beak;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Wing getWing() {
		return wing;
	}

	public void setWing(Wing wing) {
		this.wing = wing;
	}

	public Beak getBeak() {
		return beak;
	}

	public void setBeak(Beak beak) {
		this.beak = beak;
	}

	public String birdInfo() {
		String info;
		info = "Bird species: " + species
				+ ", " + "H&P: " + hp
				+ ", " + "Bird color: " + color
				+ ", " + wing.wingInfo()
				+ ", " + beak.beakInfo();
		return info;
	}
	
	public void toFly(){
		int oldHC = this.wing.getHackleCount();
		int newHC = oldHC - 234;
		wing.setHackleCount(newHC);
	}
	
	public void toSit(){
		int oldSize = this.wing.getSize();
		int newSize = oldSize / 2;
		wing.setSize(newSize);
	}
	
	public void toEat(){
		int oldSize = this.beak.getSize();
		int newSize = oldSize - 3;
		wing.setSize(newSize);
	}
	
	public void toAtack(){
		int oldSize = this.beak.getSize();
		int newSize = oldSize + 5;
		wing.setSize(newSize);
	}
}
