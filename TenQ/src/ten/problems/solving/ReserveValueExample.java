package ten.problems.solving;

import java.util.Scanner;

public class ReserveValueExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		

		
		int number = sc.nextInt();sc.close();
		int reverse = 0;
		
		for (; number != 0; number = number / 10) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

}
