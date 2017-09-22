package by.htp.lsn17.ht01_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HtFileReader {

	private static final String FILE_PATH = "c://javalsn//Ht1.txt";

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader(FILE_PATH);
			// Посимвольное считывание.
			int c;
			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
