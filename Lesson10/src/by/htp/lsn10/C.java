package by.htp.lsn10;

public class C extends B{

	public static int cC = 2;  // Статический контент не принадлежит экземпляру класса, а принадлежит классу.

	static {
		System.out.println("Static C");
	}
	
	public C() {
		super(3);
		//System.out.println("C");
	}
	
	public static void doSmth() {
		System.out.println("doSmth in C");
	}
	
	/*public void doAnything() {
		System.out.println("doAnything in C");
	}*/
}
