package by.htp.lsn17.ht01_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HtBufferedFileReader {

	private static final String FILE_PATH = "c://javalsn//Ht1.txt";

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;

		try {
			br = new BufferedReader(new FileReader(FILE_PATH));
			// fr = new FileReader(FILE_PATH);
			// br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
	}
}