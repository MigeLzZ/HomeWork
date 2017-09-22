// №1: Посчитать сумму чисел от 0 до 100.
package com.it.hometask.HomeTask02;

public class HomeTask01 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i=1; i<=100; i++){
			sum+=i;
		}
		System.out.println("Сумма чисел от 1 до 100: " + sum);
	}

}
