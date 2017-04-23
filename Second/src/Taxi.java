import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		String[] time = new String[num];
		String[] numTaxi = new String[num];

		for (int i = 0; i < num; i++) {
			time[i] = scn.next();
			numTaxi[i] = scn.next();
		}

		String temp1 = "", temp2 = "";

		for (int i = 0; i < time.length; i++) {
			for (int j = i; j < numTaxi.length; j++) {
				if (Integer.valueOf(time[i]) > Integer.valueOf(time[j])) {
					temp1 = time[i];
					temp2 = numTaxi[i];
					time[i] = time[j];
					numTaxi[i] = numTaxi[j];
					time[j] = temp1;
					numTaxi[j] = temp2;
				} else if (time[i] == time[i + 1]) {
					if (Integer.valueOf(numTaxi[i]) > Integer.valueOf(numTaxi[j])) {
						temp1 = time[i];
						temp2 = numTaxi[i];
						time[i] = time[j];
						numTaxi[i] = numTaxi[j];
						time[j] = temp1;
						numTaxi[j] = temp2;
					}

				}
			}
		}
		for (int i = 0; i < time.length; i++) {
			System.out.println(time[i] + " " + numTaxi[i]);
		}
	}

}