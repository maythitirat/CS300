import java.util.Scanner;

public class Taxi2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] time = new String[n];
		String[] numTaxi = new String[n];

		String temp = "";
		String temp2 = "";

		for (int i = 0; i < time.length; i++) {
			time[i] = scn.next();
			numTaxi[i] = scn.next();
		}

		for (int i = 0; i < time.length; i++) {
			for (int j = i; j < numTaxi.length; j++) {
//				System.out.println(time[i]+" "+time[j]);
				if (Integer.valueOf(time[i]) > Integer.valueOf(time[j])) {
					temp = time[i];
					temp2 = numTaxi[i];
					time[i] = time[j];
					numTaxi[i] = numTaxi[j];
					time[j] = temp;
					numTaxi[j] = temp2;
				} else if (Integer.valueOf(time[i]) == Integer.valueOf(time[j])) {
					if (Integer.valueOf(numTaxi[i]) > Integer.valueOf(numTaxi[j])) {
						temp = time[i];
						temp2 = numTaxi[i];
						time[i] = time[j];
						numTaxi[i] = numTaxi[j];
						time[j] = temp;
						numTaxi[j] = temp2;
					}
				}
			}
		}
//		for (int i = 0; i < time.length; i++) {
//			System.out.println(time[i] + " " + numTaxi[i]);
//		}
	}
}
