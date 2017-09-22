// №3: Программа запрашивает ввод строк текста. 
//     Продолжаем ввод до тех пор, пока не будет введено слово "stop".
package com.it.hometask.HomeTask02;

import java.util.Scanner;

public class HomeTask03 {

	static String scaner() {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите строку текста: ");
		String a = in.nextLine();
		return a;
	}
	
	public static void main(String[] args) {
		String a;
		do {
			a = scaner();
			if (a.equals("stop")){
				System.exit(0);
			}
		} while (a.equals(a));

	}

}
