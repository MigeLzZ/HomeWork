package by.htp.lsn7;

import java.util.Arrays;
import java.util.Collections;

public class Task3 {

	public static void main(String[] args) {
		
		int [] mass = new int[15];
		
		mass[0] = 2;
		mass[1] = 1;
		mass[2] = 5;
		mass[3] = 3;
		mass[4] = 7;
		mass[5] = 9;
		mass[6] = 10;
		mass[7] = 12;
		mass[8] = 45;
		mass[9] = 78;
		mass[10] = 11;
		mass[11] = 8;
		mass[12] = 23;
		mass[13] = 13;
		mass[14] = 34;
		
		//Arrays.sort(mass);
		
		
		/* for(int i = 0; i < mass.length; i++) {
			int max = mass[i];
			int imax = i;
			for (int j = i + 1; j < mass.length; j++) {
				if (mass[j] > max)
					max = mass[j];
					imax = j;
			}
			if (i != imax) {
				int temp = mass[i];
				mass[i] = mass[imax];
				mass[imax] = temp;
			}
			System.out.println(mass[i]);
		} */
		
		
		for (int i = 0; i < mass.length; i++) {
			/* Предполагаем, что начальный элемент рассматриваемого фрагмента и будет минимальным. */
			int min = mass[i]; // Предполагаемый минимальный элемент.
			int imin = i;      // Индекс минимального элемента
			// Просматриваем оставшийся фрагмент массива и ищем там элемент, меньший предположенного минимума.
			for (int j = i + 1; j < mass.length; j++) {   
				// Если находим новый минимум, то запоминаем его индекс. И обновляем значение минимума.
				if (mass[j] < min) {
					min = mass[j];
					imin = j;
				}
			}
			// Проверяем, нашёлся ли элемент меньше, чем стоит на текущей позиции. Если нашёлся, то меняем элементы местами.
			if (i != imin) {
				int temp = mass[i];
				mass[i] = mass[imin];
				mass[imin] = temp;
			}
			System.out.println(mass[i]);
		}
	
		
	}
}
