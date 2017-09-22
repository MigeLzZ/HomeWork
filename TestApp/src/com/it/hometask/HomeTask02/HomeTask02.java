// №2: Написать программу нахождения суммы большего и меньшего из 3-ёх чисел.
package com.it.hometask.HomeTask02;

public class HomeTask02 {

	public static void main(String[] args) {
		int min = 0;
		int max = 0;
		int sum = 0;
		int a = 7;
		int b = 23;
		int c = 1;
		if (a < b && a < c)
			min = a;
		else if (b < a && b < c)
			min = b;
		else if (c < a && c < b)
			min = c;
		if (a > b && a > c)
			max = a;
		else if (b > a && b > c)
			max = b;
		else if (c > a && c > b)
			max = c;
		sum = min + max;
		System.out.println("Сумма большего и меньшего из трёх чисел = " + sum);
	}

}
