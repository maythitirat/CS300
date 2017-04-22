import java.util.ArrayList;
import java.util.Scanner;

public class Song {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> order = new ArrayList<>();
		ArrayList<Integer> type = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			order.add(scn.nextInt());
			type.add(scn.nextInt());
		}

		int max = 0;
		int index = 0;
		for (int i = 1; i <= 6; i++) {
			int count = 0;
			for (int j = 0; j < type.size(); j++) {
				if (type.get(j) == i) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				index = i;
			}
			// System.out.println(i+" "+max);
		}
		max = 0;
		System.out.println(index);
		int index2 = 0;
		for (int i = 1; i <= 6; i++) {
			if (i != index) {
				int count = 0;
				for (int j = 0; j < type.size(); j++) {
					if (type.get(j) == i) {
						count++;
					}
				}
				if (count > max) {
					max = count;
					index2 = i;
				}
			}
		}
		System.out.println(index2);
	}

}
