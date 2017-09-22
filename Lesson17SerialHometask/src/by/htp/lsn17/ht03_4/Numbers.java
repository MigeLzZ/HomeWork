package by.htp.lsn17.ht03_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Numbers {

	private static final String FILE_PATH = "c://javalsn//numbers.txt";
	private static final String FILE_PATH_1 = "c://javalsn//numbers1.txt";
	
	// Не хочет записывать в тот же файл, если в BuffereReader и BufferedWriter указывать один файл,
	// то программа почему-то просто стирает всё c нужного файла и делает его пустым. ?????

	public static void main(String[] args) {
		
		BufferedReader br = null;
		FileReader fr = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		String s, sCurrentLine;
		int a,b,c;

		try {
			br = new BufferedReader(new FileReader(FILE_PATH));
			bw = new BufferedWriter(new FileWriter(FILE_PATH_1));

			while ((sCurrentLine = br.readLine()) != null) {
				if (sCurrentLine.contains("+")) {
					a = Character.digit(sCurrentLine.charAt(0), 10);
					b = Character.digit(sCurrentLine.charAt(2), 10);
					c = a + b;
					System.out.println(c);
					bw.write("= " + c);
					//s = String.valueOf(c);
					//bw.write(s, 0, 1);
				}
				if (sCurrentLine.contains("-")) {
					a = Character.digit(sCurrentLine.charAt(0), 10);
					b = Character.digit(sCurrentLine.charAt(2), 10);
					c = a - b;
					System.out.println(c);
					bw.newLine();
					bw.write("= " + c);
				}
				if (sCurrentLine.contains("*")) {
					a = Character.digit(sCurrentLine.charAt(0), 10);
					b = Character.digit(sCurrentLine.charAt(2), 10);
					c = a * b;
					System.out.println(c);
					bw.newLine();
					bw.write("= " + c);
				}
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
