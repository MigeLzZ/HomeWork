package by.htp.lsn7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void conclusion() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите Ф.И.О. студента: ");
		char [] fio = new char[50];
		int size = 0;
		char buf = ' ';
		for (int i = 0; buf != 13; i++) {
			char c = (char)br.read();
			fio[i] = buf;
			size++;
			System.out.println("Я8дщ8кгщ");
		}
		char [] newFIO = new char [size];
		for (int i = 0; i < size; i++) {
			newFIO[i] = fio[i];
		}
		Student student = new Student(newFIO);
	
	}
	
	public static void main(String[] args) throws IOException {
		conclusion();
	}

}
