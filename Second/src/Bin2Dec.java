import java.util.ArrayList;
import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> num = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			num.add(scn.nextInt());
		}
		int total = 0;
		int j = num.size() - 1;
		for (int i = 0; i < num.size(); i++) {
			total += (num.get(j) * Math.pow(2, i));
			// System.out.println(total);
			j--;
		}
		System.out.println(total);
	}
}
