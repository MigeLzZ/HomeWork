package by.htp.lsn17.ht01_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HtFileOutputStream {

	private static final String FILE_PATH = "c://javalsn//Ht2.txt";

	public static void main(String[] args) {

		String text = "Phil Nask";
		
		try {
			FileOutputStream fos = new FileOutputStream(FILE_PATH);
			byte[] buffer = text.getBytes();
			fos.write(buffer);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}