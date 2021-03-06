import java.util.ArrayList;
import java.util.Scanner;

public class Key2 {

	public static boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int start = scn.nextInt();
		int end = scn.nextInt();
		ArrayList<Integer> prime = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			if (isPrime(i) && i != 1) {
				prime.add(i);
			}
		}

		int total = prime.size();

		if (total == 0) {
			System.out.println("0");
			System.out.println(total);
		} else if (total == 1) {
			System.out.println(prime.get(0));
			System.out.println(total);
		} else if (total == 2) {
			System.out.println(prime.get(0) * prime.get(1));
			System.out.println(total);
		} else {
			System.out.println(prime.get(1) * prime.get(total - 1));
			System.out.println(total);
		}

	}

}