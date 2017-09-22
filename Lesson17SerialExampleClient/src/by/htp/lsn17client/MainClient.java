package by.htp.lsn17client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import by.htp.lsn17server.test.A;
import by.htp.lsn17univers.entity.Person;
import by.htp.lsn17univers.entity.Student;

public class MainClient {

	private static final String FILE_PATH = "c://javalsn//serial_exmpl.txt";
	
	public static void main(String[] args) {
		
		//Object personAfter = deserialize();
		//Person personAfter = (Person)deserialize(); // Вызывается конструктор ближайшего несериализуемого предка. Для класс Person ближайший - Object.
		Student.univer = "BSU";
		//Student studentAfter = (Student)deserialize();
		//System.out.println(studentAfter);
		
		A a = (A)deserialize();
		System.out.println(a.value);
	}
	
	public static Object deserialize() {
		Object obj = null;
		try {
			FileInputStream fis = new FileInputStream(FILE_PATH);
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj = ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
		
	}

}
