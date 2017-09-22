package by.htp.lsn5;

public class Wing {

	private int size;
	private int hackleCount;
	
	public Wing(int size, int hackleCount) {
		this.size = size;
		this.hackleCount = hackleCount;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getHackleCount() {
		return hackleCount;
	}

	public void setHackleCount(int hackleCount) {
		this.hackleCount = hackleCount;
	}
	
	public String wingInfo(){
		String info;
		info = "\n" + "Wing size: " + size
				+ ", " + "Hackle count: " + hackleCount;
		return info;
	}
}
