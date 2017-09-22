// №4: Приветствовать любого пользователя при вводе его имени через командную строку.
package com.it.hometask.HomeTask02;

import java.util.Scanner;

public class HomeTask04 {

	static String scaner() {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите своё имя: ");
		String name = in.nextLine();
		return name;
	}
	
	public static void main(String[] args) {
		String a = scaner();
		System.out.println("ДАРОВА " + a + " !!");
	}

}
