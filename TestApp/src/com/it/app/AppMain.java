package com.it.app;

import java.util.Scanner;

public class AppMain {
	
	static int sum(int x, int y){  // Сигнатура - название метода и список его параметров.
		//System.out.println("in sum");
		int c;
		c = x + y;
		return c;		
	}
	
	static int subtraction(int x, int y){  
		int c;
		c = x - y;
		return c;		
	}
	
	static int multiplication(int x, int y){  
		int c;
		c = x * y;
		return c;		
	}
	
	static double division(int x, int y){  
		double c;
		c = x / y;
		return c;		
	}
	
	static int scaner() {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число: ");
		int item = in.nextInt();
		return item;
	}
	
	static void months(int item){
		if (item==1){
			System.out.println("January");
		} 
		else if (item==2){
			System.out.println("February");
		}
		else if (item==3){
			System.out.println("March");
		}
		else if (item==4){
			System.out.println("April");
		}
		else if (item==5){
			System.out.println("May");
		}
		else if (item==6){
			System.out.println("June");
		}
		else if (item==7){
			System.out.println("July");
		}
		else if (item==8){
			System.out.println("August");
		}
		else if (item==9){
			System.out.println("September");
		}
		else if (item==10){
			System.out.println("October");
		}
		else if (item==11){
			System.out.println("November");
		}
		else if (item==12){
			System.out.println("December");
		}
	}
	
	
	public static void main(String[] args) {
		int item = scaner();
		//boolean decision = false;
		//int item = 5;
		
		//int result = 0;
		//scaner();
		months(item);
		
		//System.out.println(result);
		
		//int result = sum(3, 5);
		//int result2;
		//result2 = sum(2, 8);
		
		//int result3 = minus(4,3);
		//int result4 = proizv(5,7);
		//double result5 = delenie(10,3);
		//System.out.println(result);
		//System.out.println(result2);
		//System.out.println(result3);
		//System.out.println(result4);
		//System.out.println(result5);
	}

}
