package by.htp.lsn10;

public class Main {

	public static void main(String[] args) {
		
		Object obj = new C();
		A a = new C();
		B b = new B();
		C c = new C();
		A aa = new A();
		
		a.doSmth();   // static
		a.doAnything(); // non-static
		b.doSmth();
		b.doAnything();
		c.doSmth();
		c.doAnything();
		aa.doSmth();
		aa.doAnything();
		
		/*System.out.println("a.aA " + a.aA);
		System.out.println("b.aA " + b.aA);
		System.out.println("b.bB " + b.bB);
		System.out.println("c.aA " + c.aA);
		System.out.println("c.bB " + c.bB);
		System.out.println("c.cC " + c.cC);*/
		
		/* C c = new C();
		//A a = new C();

		Main main = new Main();
		main.doSmth(); */
	}
	
	public void doSmth() {
		
	}

}
