package by.htp.lsn16;

public class App {

	public static void main(String[] args) {
		
		Terminator t800 = TerminatorFactory.getTerminator("T800");
		t800.showTarget();
		Terminator t1000 = TerminatorFactory.getTerminator("T1000");	
		t1000.showTarget();
		Terminator t2000 = TerminatorFactory.getTerminator("T2000");
		t2000.showTarget();
	}

}

// Считывание информации книжек с файла. (view LibraryCatalog)
// Добавить реализацию нового терминатора, например: который будет спасать мир. (Терминатор Т2000, цель спасти мир) 