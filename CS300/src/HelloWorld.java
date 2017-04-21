import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String first = scn.next();
		String last = scn.next();
		String sex = scn.next();
		
		if(sex.equalsIgnoreCase("f")){
			System.out.println("Hello "+"Ms. "+last+", "+first);
		}
		else{
			System.out.println("Hello "+"Mr. "+last+", "+first);
		}

	}

}
