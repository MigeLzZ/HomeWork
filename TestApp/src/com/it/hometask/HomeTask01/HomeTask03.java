// �3: ������ � ���������� ����� �� -9 �� 9. ���������� �������� �� �������� ����� ������ �������������.
package com.it.hometask.HomeTask01;

import java.util.Scanner;

public class HomeTask03 {

	static int scaner1() {
		Scanner in = new Scanner(System.in);
		System.out.print("������� ����� �� -9 �� 9: ");
		int item1 = in.nextInt();
		return item1;
	}
	
	
	static void determinant(int item1) { 
		if (item1 > 9 || item1 < -9) {
			System.out.print("������� ���������� �����!");
			System.exit(0);
		} else if (item1 % 2 == 0 && item1 > 0) {
			System.out.println("����� " + item1 + " �������� ������, �������������.");
		} else if (item1 % 2 == 0 && item1 < 0) {
			System.out.println("����� " + item1 + " �������� ������, �������������.");
		} else if (item1 % 2 != 0 && item1 > 0){
			System.out.println("����� " + item1 + " �������� ��������, �������������.");
		} else if (item1 % 2 != 0 && item1 < 0){
			System.out.println("����� " + item1 + " �������� ��������, �������������.");
		}
	}
	
	public static void main(String[] args) {
		int item1 = scaner1();
		determinant(item1);
	}

}