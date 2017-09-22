package by.htp.lsn8;

public class Task08 {

	static void bubbleSort(int arr[]) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[10];
		arr[0] = 3;
		arr[1] = 1;
		arr[2] = 10;
		arr[3] = 8;
		arr[4] = 20;
		arr[5] = 7;
		arr[6] = 9;
		arr[7] = 5;
		arr[8] = 2;
		arr[9] = 33;
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.printf("%5d ", arr[i]);

	}

}
