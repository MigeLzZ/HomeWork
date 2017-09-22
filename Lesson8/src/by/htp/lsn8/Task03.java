package by.htp.lsn8;

public class Task03 {

	public static void main(String[] args) {
		double A[] = new double[20];
		double B[] = new double[10];
		
		A[0] = -1.49;
		A[1] = 0.50;
		A[2] = -4.70;
		A[3] = -1.08;
		A[4] = -4.95;
		A[5] = 1.14;
		A[6] = -2.46;
		A[7] = 2.61;
		A[8] = -3.14;
		A[9] = 4.35;
		A[10] = 0.52;
		A[11] = 1.24;
		A[12] = 4.29;
		A[13] = -2.39;
		A[14] = -3.95;
		A[15] = -4.91;
		A[16] = -4.35;
		A[17] = 3.60;
		A[18] = 2.50;
		A[19] = -0.21;

		int j = - 1;  // —чЄтчик элементов массива B.
		double sum = 0;
		
		for (int i = 0; i < A.length; i++)
			System.out.printf("%.2f ", A[i]);
		
		System.out.println(" ");
		
		for (int i = 1; i < A.length; i = i + 2) {
			if (A[i] > 0) {
				j++;
				B[j] = A[i];
			}
		}
		
		for (j = 0; j < B.length; j++)
			System.out.printf("%.2f ", B[j]);
		
		for (j = 0; j < B.length; j++) {
			double sq = B[j] * B[j];
			sum = sum + sq;
		}
		
		System.out.println(" ");
		
		System.out.println("Sum = " + sum);
	}

}
