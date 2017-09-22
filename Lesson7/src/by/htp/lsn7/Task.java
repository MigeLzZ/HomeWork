package by.htp.lsn7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {
	public static void main(String[] args) throws IOException {
		int[] array = new int[25];
		int[] arrayBuf;
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		for (int k : array) {
			System.out.print(k + "  ");
		}
		System.out.println();
		arrayBuf = delete(array);
		for (int k : arrayBuf) {
			System.out.print(k + "  ");
		}
		System.out.println();
		arrayBuf = delete(array, 24);
		for (int k : arrayBuf) {
			System.out.print(k + "  ");
		}
		System.out.println();
		Student student1 = getStudent();
		for (int i = 0; i < student1.getFio().length; i++) {
			System.out.print(student1.getFio()[i]);
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		for (int k : array) {
			System.out.print(k + "  ");
		}
		System.out.println();
		sortArray(array, true);
		for (int k : array) {
			System.out.print(k + "  ");
		}
		System.out.println();
		sortArray(array, false);
		for (int k : array) {
			System.out.print(k + "  ");
		}
		System.out.println();

	}

	public static int[] delete(int[] array) {
		int newSize = (array.length + 1) / 2;
		int[] newArray = new int[newSize];
		for (int i = 0, j = 0; i < array.length; i += 2, j++) {
			newArray[j] = array[i];
		}
		return newArray;
	}

	public static int[] delete(int[] array, int index) {
		if (index >= array.length || index < 0) {
			System.out.println("Выход за пределы массива");
			return array;
		}
		int[] newArray = new int[array.length - 1];
		for (int i = 0, j = 0; i < array.length; i++, j++) {
			if (i == index) {
				j--;
				continue;
			}
			newArray[j] = array[i];
		}
		return newArray;
	}

	public static Student getStudent() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter FIO of student:");
		char[] fio = new char[50];
		int size = 0;
		char buf = ' ';
		for (int i = 0; buf != 13; i++) {
			buf = (char) br.read();
			fio[i] = buf;
			size++;
		}
		char[] newFio = new char[size];
		for (int i = 0; i < size; i++) {
			newFio[i] = fio[i];
		}
		Student student = new Student(newFio);
		return student;
	}

	public static void sortArray(int[] array, boolean kind) {
		int buf;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j] > array[j - 1] && kind) {
					buf = array[j];
					array[j] = array[j - 1];
					array[j - 1] = buf;
				}
				if (array[j] < array[j - 1] && !kind) {
					buf = array[j];
					array[j] = array[j - 1];
					array[j - 1] = buf;
				}
			}
		}
	}

}
