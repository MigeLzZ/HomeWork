package by.htp.lsn8;

import java.util.Random;
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		System.out.println("¬ведите размерность матрицы MxN: ");
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();

		int[][] a = new int[M][N];
		int b = 0;

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

		System.out.println("¬ведите элемент X: ");
		int X = in.nextInt();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (X == a[i][j]) {
					b++;
				}
			}
		}
		System.out.println("Ёлемент ’ встретилс€ " + b + " раз(-а).");

	}

}
