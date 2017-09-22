package by.htp.lsn16;

public class T800 extends Terminator{

	public T800(Target target) {
		super(target);
	}

	@Override
	public void showTarget() {
		System.out.println(T800.class.getSimpleName() + " target: ");
		super.showTarget();
	}
	
	
}
