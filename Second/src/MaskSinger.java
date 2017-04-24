import java.util.ArrayList;
import java.util.Scanner;

public class MaskSinger {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] score = new int[n][n-1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-1; j++) {
				score[i][j] = scn.nextInt();
			}
		}
		
		ArrayList<Integer> point = new ArrayList<>();
		int max = 0;
		int index = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n-1; j++) {
				sum += score[i][j];
			}
			if(sum > max){
				max = sum;
				index = i;
			}
		}
		System.out.println(index+1);
		System.out.println(max);
		

	}

}
