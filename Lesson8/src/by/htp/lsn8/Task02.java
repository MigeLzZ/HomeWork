package by.htp.lsn8;

public class Task02 {

	public static void main(String[] args) {
		double mass[] = new double[5];
		int i = 0;

		mass[0] = 5;
		mass[1] = 25;
		mass[2] = 90;
		mass[3] = 145;
		mass[4] = 20;

		double max = mass[0];
		int imax = 0;
		
		for (i = 0; i < mass.length; i++)
			System.out.printf("%.2f ", mass[i]);
		System.out.println(" ");

		for (i = 0; i < mass.length; i++) {
			if (max < mass[i]) {
				max = mass[i];
				imax = i;
			}
		}
		
		double temp = mass[imax];
		mass[0] = mass[0] / temp;
		mass[1] = mass[1] / temp;
		mass[2] = mass[2] / temp;
		mass[3] = mass[3] / temp;
		mass[4] = mass[4] / temp;
		
		for (i = 0; i < mass.length; i++)
			System.out.printf("%.2f  ", mass[i]);
	}
}
