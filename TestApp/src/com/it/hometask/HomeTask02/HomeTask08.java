// �8: ������ � ������� n ����� �����. �� ������� �������: �����, ������� ������� �� 3 ��� �� 9.
package com.it.hometask.HomeTask02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HomeTask08 {

	private static void modNumbers(int divider, Integer[] sourceNumbers) {
        System.out.print("�����, ������� ������� �� " + divider + ": ");
        for (Integer sourceNumber : sourceNumbers) {
            if (sourceNumber % divider == 0) {
                System.out.print(sourceNumber + ", ");
            }
        }
        System.out.println();
    }



	public static void main(String[] args) {
        System.out.print("������� ����� ����� ��� �����? ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            System.out.print("�����.");
            System.exit(0);	
        }
        Integer[] sourceNumbers = new Integer[n];
        System.out.print("������� ����� �����: ");
        for (int i = 0; i < n; i++) {
            sourceNumbers[i] = in.nextInt();
        }
        modNumbers(3, sourceNumbers);
        modNumbers(9, sourceNumbers);
	}

}