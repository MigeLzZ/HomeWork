// �5: ������ ����� ����� ��� ��������� ��������� ������, ���������� �� 
//     �����(������������) � ������� ��������� �� �������.
package com.it.hometask.HomeTask02;

import java.util.Scanner;

public class HomeTask05 {

	public static void main(String[] args) {
		int sum = 0;
		int multipl = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("������� ����� a: ");
		int a = in.nextInt();
		System.out.print("������� ����� b: ");
		int b = in.nextInt();
		System.out.print("������� ����� c: ");
		int c = in.nextInt();
		sum = a + b + c;
		multipl = a * b * c;
		System.out.println("C���� �������� ����� = " + sum);
		System.out.println("������������ �������� ����� = " + multipl);
	}

}
