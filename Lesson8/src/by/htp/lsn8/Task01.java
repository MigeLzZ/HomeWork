package by.htp.lsn8;

import java.util.Arrays;

public class Task01 {
		
	public static void main(String[] args) {
		int mass[] = new int[5];
		int i = 0;
		
		mass[0] = 5;
		mass[1] = 2;
		mass[2] = 9;
		mass[3] = 14;
		mass[4] = 3;
		
		int min = mass[0]; // Предполагаемый минимальный элемент.
		int max = mass[0];
		int imin = 0;      // Индекс минимального элемента
		int imax = 0;

		for (i = 0; i < mass.length; i++) {
			if (max < mass[i]) {
				max = mass[i];
				imax = i;
			}
			if (min > mass[i]) {
				min = mass[i];
				imin = i;
			}
		}
		int temp = mass[imax];
		mass[imax] = mass[imin];
		mass[imin] = temp;
		
		for (i = 0; i < mass.length; i++)
			System.out.printf("%5d ", mass[i]);
	}
}
