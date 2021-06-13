package ten.problems.solving;

import java.util.Scanner;

public class FibonacciExample {

	public static void main(String[] args) {

		/*
		 * Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5
		 * 8 13 ... . up to a given number, the number value is an input inserted by the
		 * user.
		 */

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int first = 1;
		int second = 1;
		System.out.print(first + " ," + second);

		int nextNumber;
		
		for (int i = 0; i < input; i++) {
			nextNumber = first + second;
			if(nextNumber<=input)
			{System.out.print(" ,"+nextNumber);
			first = second;
			second = nextNumber;}
		}

		sc.close();

	}

}
