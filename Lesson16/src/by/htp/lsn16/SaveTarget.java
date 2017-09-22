package by.htp.lsn16;

public class SaveTarget extends AbstractTarget{
	
	public SaveTarget(String value) {
		super(value);
	}

	public void show() {
		System.out.println("Save: " + value);
	}
}
