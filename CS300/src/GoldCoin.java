import java.util.ArrayList;
import java.util.Scanner;

public class GoldCoin {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int l = scn.nextInt();
		int m = scn.nextInt();
		int d = scn.nextInt();
		int q = scn.nextInt();
		int s = scn.nextInt();
		ArrayList<Integer> arrQ = new ArrayList<>();
		ArrayList<Integer> arrQcoin = new ArrayList<>();
		ArrayList<Integer> arrS = new ArrayList<>();
		ArrayList<Integer> arrD = new ArrayList<>();

		for (int i = 0; i < s; i++) {
			arrS.add(scn.nextInt());
		}
		for (int i = 0; i < q; i++) {
			arrQ.add(scn.nextInt());
			arrQcoin.add(scn.nextInt());
		}
		for (int i = 0; i < d; i++) {
			arrD.add(scn.nextInt());
		}
		////////////////////////////////////////////////////////

		int distance = 0;
		for (int i = 0; i < d; i++) {
			distance = distance + arrD.get(i);
			if (m == 0) {
				System.out.println("0");
				break;
			} else {
				if (distance < l) {
					m = m - 1;
					if(m == 0){
//						System.out.println("0");
						break;
					}
					for (int j = 0; j < s; j++) {
						if (distance == arrS.get(j)) {
							m = m * 2;
						}
					}
					for (int j = 0; j < q; j++) {
						if (distance == arrQ.get(j)) {
							m = m + arrQcoin.get(j);
						}
					}
				}
			}
		}
		System.out.println(m);
	}

}
