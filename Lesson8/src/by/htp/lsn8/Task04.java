package by.htp.lsn8;

import java.util.Random;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		System.out.println("¬ведите 2 строки, которые вы хотите помен€ть: ");
		Scanner in = new Scanner(System.in);
		int str1 = in.nextInt();
		int str2 = in.nextInt();

		int[][] a = new int[5][5];

		Random rnd = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rnd.nextInt(10) + 1;
			}
		}
		for (int i = 0; i < a.length; i++, System.out.println()) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

		System.out.println(" ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int temp = a[str1][j];
				a[str1][j] = a[str2][j];
				a[str2][j] = temp;
			}
		}

		for (int i = 0; i < a.length; i++, System.out.println()) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}
}
