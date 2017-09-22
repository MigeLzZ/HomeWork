package by.htp.lsn5;

public class Beak {

	private int size;
	private String shF; // Sharp or Flat.
	
	public Beak(int size, String shF) {
		this.size = size;
		this.shF = shF;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getShF() {
		return shF;
	}
	public void setShF(String shF) {
		this.shF = shF;
	}
	
	public String beakInfo(){
		String info;
		info = "\n" + "Beak size: " + size
				+ ", " + "Sharp or Flat: " + shF;
		return info;
	}
}
