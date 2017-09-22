package by.htp.lsn16;

public class T2000 extends Terminator{

	public T2000(Target target) {
		super(target);
	}

	@Override
	public void showTarget() {
		System.out.println(T2000.class.getSimpleName() + " target: ");
		super.showTarget();
	}
	
}
