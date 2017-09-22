// є6: ќтобразить в окне консоли аргументы командной строки в обратном пор€дке.
package com.it.hometask.HomeTask02;

import java.util.Scanner;

public class HomeTask06 {

	public static void reverseString(String s, int index) {
		if(index == 0) {                          // явл€етс€ ли текущий индекс символа нулевым.
			System.out.println(s.charAt(index));  // ≈сли да, то происходит вывод в консоль последнего
			return;                               // символа с последующим переходом на новую строку и возврат из метода.
		}
		System.out.print(s.charAt(index));
		reverseString(s, index - 1);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите строку: ");
		String s = in.nextLine();
		if (s.length() > 0) {
			reverseString(s, s.length() - 1);
		}
	}

}
