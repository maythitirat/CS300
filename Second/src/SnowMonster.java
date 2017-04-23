import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SnowMonster {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int monster = scn.nextInt();
		ArrayList<Integer> man = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			man.add(scn.nextInt());
		}
		int count = 0;
		ArrayList<Integer> order = new ArrayList<>();
		for (int i = 0; i < man.size(); i++) {
			for (int j = 0; j < man.size(); j++) {
				if(man.get(i)+man.get(j) == monster&& ((i%2 == 0 && j%2 !=0) || (i%2 != 0 && j%2 ==0))){
//					System.out.println(i+1+" "+(j+1));
					count++;
					order.add(i+1);
				}
			}
		}
		Collections.sort(order);
		System.out.println(count/2);
		System.out.println(order.get(order.size()-1));
	}

}
