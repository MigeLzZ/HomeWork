package by.htp.lsn17.ht01_2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class HtFileWriter {

	private static final String FILE_PATH = "c://javalsn//Ht2.txt";

	public static void main(String[] args) {

		String text = "Phil Nask";
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(FILE_PATH);
			// Запись всей строки
			writer.write(text);
			// Запись по символам
			writer.append('\n');
			writer.append('E');
			
			writer.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}