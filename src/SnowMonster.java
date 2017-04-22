import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SnowMonster {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int e = scn.nextInt();
		ArrayList<Integer> d = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			d.add(scn.nextInt());
		}

		ArrayList<Integer> man = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < d.size(); i++) {
			for (int j = 0; j < d.size(); j++) {
				if (i != j) {
					int power = d.get(i) + d.get(j);

					if ((power == e && i % 2 == 0 && j % 2 == 1) || (power == e && i % 2 == 1 && j % 2 == 0)) {
						count++;
						man.add(i);
						man.add(j);
					}
				}
			}
		}
		Collections.sort(man);
		System.out.println(count / 2);
		System.out.println(man.get(man.size() - 1) + 1);
	}

}
