// №8: Ввести с консоли n целых чисел. На консоль вывести: Числа, которые делятся на 3 или на 9.
package com.it.hometask.HomeTask02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HomeTask08 {

	private static void modNumbers(int divider, Integer[] sourceNumbers) {
        System.out.print("Числа, которые делятся на " + divider + ": ");
        for (Integer sourceNumber : sourceNumbers) {
            if (sourceNumber % divider == 0) {
                System.out.print(sourceNumber + ", ");
            }
        }
        System.out.println();
    }



	public static void main(String[] args) {
        System.out.print("Сколько целых чисел вам нужно? ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            System.out.print("Конец.");
            System.exit(0);	
        }
        Integer[] sourceNumbers = new Integer[n];
        System.out.print("Введите целые числа: ");
        for (int i = 0; i < n; i++) {
            sourceNumbers[i] = in.nextInt();
        }
        modNumbers(3, sourceNumbers);
        modNumbers(9, sourceNumbers);
	}

}