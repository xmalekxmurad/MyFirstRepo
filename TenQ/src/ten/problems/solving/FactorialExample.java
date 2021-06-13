package ten.problems.solving;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		// 5! = 5 * 4 * 3 * 2 * 1 = 125

		System.out.println("Enter a Number. . .");
		Scanner sc = new Scanner(System.in);
		int inputValue = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= inputValue; i++)
			factorial = factorial * i;

		System.out.println("Factorial of " + inputValue + " is : " + factorial);
		sc.close();
	}

}
