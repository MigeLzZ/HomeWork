package by.htp.lsn17univers.entity;

import java.io.Serializable;

public class Group implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8871907192046679393L;
	
	private int number;

	public Group() {
		super();
	}

	public Group(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Group [number=" + number + "]";
	}
	
	
}
