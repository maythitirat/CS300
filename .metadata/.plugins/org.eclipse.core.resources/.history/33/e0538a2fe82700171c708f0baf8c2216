import java.util.ArrayList;
import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> num = new ArrayList<>();
		for(int i=0;i<n;i++){
			num.add(scn.nextInt());
		}
		
		int total = 0;
		int j = 0;
		for(int i=num.size()-1;i>=0;i--){
			total = (int) (total + (num.get(j)*Math.pow(2, i)));
			j++;
//			System.out.println(total);
		}
		System.out.println(total);
	}
	

}
