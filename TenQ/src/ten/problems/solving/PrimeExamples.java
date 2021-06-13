package ten.problems.solving;

import java.util.Scanner;

public class PrimeExamples {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inputNumber = sc.nextInt();
		
		sc.close();
		int i = 0;
		int num = 0; 
		// Empty String
		String primeNumbers = "";

		for (i = 1; i <= inputNumber; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to inputNumber are :");
		System.out.println(primeNumbers);

//		Scanner sc = new Scanner(System.in);
//
//		int input = sc.nextInt();
//		sc.close();
//		for (int i = 1; i < input; i++) {
//			if (i % 2 == 0 || i % 3 == 0)
//				i++;
//		/*	else if (i % 3 == 0)
//				i++;*/
//			
//				System.out.println("numbers: " + i);
//		}
	}
}
