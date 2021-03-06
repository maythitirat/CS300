import java.util.ArrayList;
import java.util.Scanner;

public class Bus {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> h = new ArrayList<>();
		ArrayList<Integer> m = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			h.add(scn.nextInt());
			m.add(scn.nextInt());
		}
		int total = 0;
		for (int i = h.size() - 1; i > 0; i--) {
			total += (h.get(i) * 60 + m.get(i)) - (h.get(i - 1) * 60 + m.get(i - 1));
		}
		int wait = total / (n - 1);
		System.out.println(wait);
	}
}
