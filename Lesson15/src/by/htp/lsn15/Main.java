package by.htp.lsn15;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

public class Main {
	
	// Сделать считывание книжек из файла.
	
	public static void main(String[] args) {  
		
		/*try {
			InputStream is = new FileInputStream("C:\\javalsn\\simple.txt");
			int a;
			while ((a = is.read()) != -1) {
				System.out.println((char)a);
			} */
		
		try {
			InputStream is = new FileInputStream("C:\\javalsn\\simple.txt");
			BufferedInputStream br = new BufferedInputStream(is);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
	/* public static void main(String[] args) {
		
		try {
			File file = new File("c:\\javalsn\\simple2.txt");
			file.createNewFile();
			Reader reader = new FileReader(file);
			
			Reader reader2 = new FileReader("C:\\javalsn\\simple.txt");
			BufferedReader br = new BufferedReader(reader2);
			
			int data = reader2.read();
			char c = (char)data; // приведение типа;
			
			int data2 = reader2.read();
			char c2 = (char)data2;
			
			System.err.println(data + " " + c);
			System.out.println(data + " " + c);
			
			System.err.println(data2 + " " + c2);
			System.out.println(data2 + " " + c2);
			
			int a;
			while((a = reader2.read()) != -1) {
				System.out.println((char)a);
			}
			
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("In: FileNotFoundException catch block");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		Writer writer;
		
	} 

} */
