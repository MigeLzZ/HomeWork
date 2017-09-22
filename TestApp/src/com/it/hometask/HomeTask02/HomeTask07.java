// №7: Ввести с консоли n целых чисел. На консоль вывести: Чётные и Нечётные числа.
package com.it.hometask.HomeTask02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeTask07 {

	private static void evensAndOdds (Integer[] sourceNumbers) {
        List<Integer> evens = new ArrayList<Integer>();   // Чётные.
        List<Integer> odds = new ArrayList<Integer>();    // Нечётные.
        for (Integer sourceNumber : sourceNumbers) {
            if (sourceNumber % 2 == 0) {
                evens.add(sourceNumber);
            } else {
                odds.add(sourceNumber);
            }
        }
        System.out.println("Чётные числа: " + evens);
        System.out.println("Нечётные числа: " + odds);
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
        evensAndOdds(sourceNumbers);
	}

}
