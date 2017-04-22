import java.util.ArrayList;
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> bit = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bit.add(scn.nextInt());
		}
		int mul = scn.nextInt();
		int total = 0;
		int j = 0;
		for(int i=n-1;i>=0;i--){
			total += bit.get(j)*Math.pow(2, i);
			j++;
		}
		int result = total*mul;
//		System.out.println(result);
		String binary = Integer.toBinaryString(result);
		for(int i=0;i<binary.length();i++){
			System.out.println(binary.charAt(i));
		}
		

	}

}
