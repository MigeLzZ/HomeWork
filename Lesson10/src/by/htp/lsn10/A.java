package by.htp.lsn10;

public class A {

	public static int aA = 0;
	protected int a = 1;
	
	static {
		System.out.println("Static A");
	}
	
	{
		a = 2;
	}
	
	{
		a = 4;
	}
	
	public A() {
		super();
		a = 3;
		//System.out.println("A" + a);
	}
	
	public static void doSmth() {
		System.out.println("doSmth in A");
	}
	
	public void doAnything() {
		System.out.println("doAnything in A");
	}
}
