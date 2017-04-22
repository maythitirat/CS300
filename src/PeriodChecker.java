import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeriodChecker {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();

		int[][] man = new int[n][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				man[j][i] = scn.nextInt();
			}
		}
		int cc = 1;
		boolean state = true;
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> count = new ArrayList<>();
			int sum = 0;
			for (int j = m - 1; j > 0; j--) {
				sum = man[i][j] - man[i][j - 1];
				count.add(sum);
				// System.out.println(sum);
			}
//			System.out.println(" ");
			Collections.sort(count);
			if (count.get(0) == count.get(count.size() - 1)) {
				System.out.println("1 " + count.get(0));
			} else {
				System.out.println("0 " + count.get(count.size() - 1));
			}
		}
	}

}
