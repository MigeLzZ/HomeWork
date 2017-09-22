package by.htp.lsn8;

import java.util.Random;
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		System.out.println("Введите размерность матрицы MxN: ");
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();

		int[][] a = new int[M][N];
		int max = a[0][0];

		Random rnd = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rnd.nextInt(100) + 1;
			}
		}
		for (int i = 0; i < a.length; i++, System.out.println()) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

		System.out.println(" ");

		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (max < a[j][i]) {
					max = a[j][i];
				}
			}
			System.out.println("Максимальный элемент: " + max);
			max = 0;
		}

	}

}
