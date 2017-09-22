package by.htp.lsn17.ht01_2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HtBufferedOuputStream {

	private static final String FILE_PATH = "c://javalsn//Ht2.txt";

	public static void main(String[] args) {

		File file = new File(FILE_PATH);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		String text = "Phil Nask";
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			byte[] buffer = text.getBytes();
			/*for (int i = 0; i < buffer.length; i ++)
				System.out.println(buffer[i]);*/
			bos.write(buffer, 0 , buffer.length);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				/*if (fos != null)
				fos.close();*/
				if (bos != null)
				bos.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}