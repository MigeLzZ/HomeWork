package by.htp.lsn17.ht01_2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class HtBufferedFileWriter {
	
	private static final String FILE_PATH = "c://javalsn//Ht2.txt";

	public static void main(String[] args) {
		
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(FILE_PATH));
			
			String text = "Наскович Филипп Олегович";
			bw.write(text);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}
