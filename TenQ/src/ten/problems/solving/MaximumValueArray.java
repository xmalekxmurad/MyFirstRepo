package ten.problems.solving;

import java.util.Scanner;

public class MaximumValueArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int arr[] = new int[input];

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		sc.close();

		int maxNum;
		int i = 0;
		maxNum = arr[i];
		for (; i < arr.length; i++) {

			if (maxNum <= arr[i])
				maxNum = arr[i];
			System.out.println("max number: " + maxNum + " arr[" + i + "]: " + arr[i]);
		}
	}
}