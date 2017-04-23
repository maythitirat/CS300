import java.util.ArrayList;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String n = scn.next();
		int count = 1;
		while (true) {
			// System.out.println("n length: "+n.length());
			int sum = 0;
			for (int i = 0; i < n.length(); i++) {
				sum = (int) (sum + Math.pow(Character.getNumericValue(n.charAt(i)), 2));
				// System.out.println(sum);
			}
//			System.out.println(sum);
			if (sum == 1 || sum == 4) {
				System.out.println(sum);
				System.out.println(count);
				break;
			}
			else{
				n = String.valueOf(sum);
			}
			count++;
		}
	}

}
