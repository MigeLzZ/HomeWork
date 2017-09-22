package by.htp.lsn7;

public class Task1 {

	
	public static void main(String[] args) {
		
		int[] number = new int[25];
		int[] number1 = new int[13];

		for (int i = 0; i < number.length; i++) {

			number[i] = i + 1;
			/*
			 * System.out.println("--------" + number[i]); if(i%2==0){
			 * number[i]=0; } System.out.println(number[i]);
			 */
		}
		int j = 0;
		for (int i = 0; i < number1.length; i++) {
			/* for(int j=0;j<number.length;j=j+2){ */

			number1[i] = number[j];
			System.out.println(number1[i] - 1);

			j = j + 2;

		}

	}

}
