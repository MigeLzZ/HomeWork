package by.htp.lsn17.ht01_2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class HtBufferedInputStream {

	private static final String FILE_PATH = "c://javalsn//Ht1.txt";

	public static void main(String[] args) {

		File file = new File(FILE_PATH);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			int c;
			while ((c = bis.read()) != -1) {
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				bis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}