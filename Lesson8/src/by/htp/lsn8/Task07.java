package by.htp.lsn8;

public class Task07 {
	
	// Сортировка выбором.
	
	public static void selectionSort(int[] numbers) {
		int min, temp;
		
		for (int index = 0; index < numbers.length - 1; index++) {
			min = index;
			for (int scan = index + 1; scan < numbers.length; scan++) {
				if (numbers[scan] < numbers[min])
					min = scan;
			}
			temp = numbers[min];
			numbers[min] = numbers[index];
			numbers[index] = temp;
		}
	}
	
	public static void main(String[] args) {
		int numbers[] = new int[10];
		numbers[0] = 3;
		numbers[1] = 1;
		numbers[2] = 10;
		numbers[3] = 8;
		numbers[4] = 20;
		numbers[5] = 7;
		numbers[6] = 9;
		numbers[7] = 5;
		numbers[8] = 2;
		numbers[9] = 33;
		selectionSort(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.printf("%5d ", numbers[i]);
	}
}
