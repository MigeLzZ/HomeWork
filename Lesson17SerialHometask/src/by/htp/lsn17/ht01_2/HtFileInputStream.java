package by.htp.lsn17.ht01_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class HtFileInputStream {

	private static final String FILE_PATH = "c://javalsn//Ht1.txt";

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream(FILE_PATH);
			//ObjectInputStream ois = new ObjectInputStream(fis);

			int i;
			while ((i = fis.read()) != -1) {

				System.out.print((char)i);
			}
			//System.out.println(ois.readObject());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} /*catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/

	}
}