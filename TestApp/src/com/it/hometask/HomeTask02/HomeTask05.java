// №5: Ввести целые числа как аргументы командной строки, подсчитать их 
//     суммы(произведения) и вывести результат на консоль.
package com.it.hometask.HomeTask02;

import java.util.Scanner;

public class HomeTask05 {

	public static void main(String[] args) {
		int sum = 0;
		int multipl = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число a: ");
		int a = in.nextInt();
		System.out.print("Введите число b: ");
		int b = in.nextInt();
		System.out.print("Введите число c: ");
		int c = in.nextInt();
		sum = a + b + c;
		multipl = a * b * c;
		System.out.println("Cумма введённых чисел = " + sum);
		System.out.println("Произведение введённых чисел = " + multipl);
	}

}
