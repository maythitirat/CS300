import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinAbsDifferent {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> number = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			number.add(scn.nextInt());
		}
		ArrayList<Integer> min = new ArrayList<>();
		for (int i = 0; i < number.size(); i++) {
			for (int j = i+1; j < number.size(); j++) {
//				System.out.println(number.get(i) + " " + number.get(j) + " " + Math.abs(number.get(i) - number.get(j)));
				min.add(Math.abs(number.get(i) - number.get(j)));
			}
		}
		Collections.sort(min);
		System.out.println(min.get(0));
	}
}
