import java.util.ArrayList;
import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			arr.add(scn.nextInt());
		}

		int check = 0;
		for (int i = 0; i <= 9; i++) {
			int count = 0;
			for (int j = 0; j < 20; j++) {
				if (arr.get(j) == i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
