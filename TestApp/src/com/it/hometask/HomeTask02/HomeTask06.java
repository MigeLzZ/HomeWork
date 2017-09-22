// �6: ���������� � ���� ������� ��������� ��������� ������ � �������� �������.
package com.it.hometask.HomeTask02;

import java.util.Scanner;

public class HomeTask06 {

	public static void reverseString(String s, int index) {
		if(index == 0) {                          // �������� �� ������� ������ ������� �������.
			System.out.println(s.charAt(index));  // ���� ��, �� ���������� ����� � ������� ����������
			return;                               // ������� � ����������� ��������� �� ����� ������ � ������� �� ������.
		}
		System.out.print(s.charAt(index));
		reverseString(s, index - 1);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������� ������: ");
		String s = in.nextLine();
		if (s.length() > 0) {
			reverseString(s, s.length() - 1);
		}
	}

}
