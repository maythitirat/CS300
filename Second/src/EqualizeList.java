import java.util.ArrayList;
import java.util.Scanner;

public class EqualizeList {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(scn.nextInt());
		}
		int count = 0;
		int max = 0;
		int index = 0;
		for (int i = 0; i < a.size(); i++) {
			count = 0;
			for (int j = 0; j < a.size(); j++) {
				if(a.get(i) == a.get(j)){
					count++;
				}
			}
//			System.out.println("i "+a.get(i)+" count "+count);
			if(count > max){
//				System.out.println("count "+count+" max "+max);
				max = count;
				index = a.get(i);
//				System.out.println(max);
			}
		}
		System.out.println(index);
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i) != index){
				System.out.println(a.get(i));
			}
		}
	}
}
