package by.htp.lsn17server;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import by.htp.lsn17server.test.A;
import by.htp.lsn17univers.entity.Group;
import by.htp.lsn17univers.entity.Person;
import by.htp.lsn17univers.entity.Student;

public class MainServer {

	private static final String FILE_PATH = "c://javalsn//serial_exmpl.txt";
	
	public static void main(String[] args) {  
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(FILE_PATH);
			ObjectOutputStream os = new ObjectOutputStream(fos);
			
			//Person p = new Person("Person1", 100);
			Student stud = new Student("Student1", 100, new Group(23));
			stud.univer = "BSUIR";
			stud.avg = 5;
			//os.writeObject(stud);      // Здесь происходит сериализация нашего объекта, т.е. сохранение состояния нашего объекта Person - сохранение значения String и age.
			
			A a = new A();
			a.value = "one";
			os.writeObject(a);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
