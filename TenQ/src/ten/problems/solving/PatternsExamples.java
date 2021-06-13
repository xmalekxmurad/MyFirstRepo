package ten.problems.solving;

public class PatternsExamples {

	public static void main(String[] args) {

//		  for (int row = 0; row <= 4; row++) { 
//			  for (int col  = 0; col  <= row; col ++) {
//				  System.out.print("* "); 
//				  } 
//			  System.out.print("\n"); 
//			  }

		/*************************************************/

//		for (int row = 0; row <= 4; row++) {
//			for (int col = 4; col >= row; col--) {
//				System.out.print("* ");
//			}
//			System.out.print("\n");
//		}

		/*************************************************/

//		for (int row = 0; row <= 4; row++) {
//			
//			for (int blank = 4 - row; blank > 0; blank--)
//				System.out.print(" ");
//			
//			for (int col = 0; col <= row; col++)
//				System.out.print("*");
//			
//			System.out.println();
//		}

		/*************************************************/

//		// Shape 1
//		for (int row = 0; row <= 4; row++) {
//			for (int col = 0; col <= row; col++) {
//				System.out.print("* ");
//			}
//
//			System.out.print("\n");
//		}
//		// Shape 2
//		for (int row = 0; row <= 5; row++) {
//			for (int col = 5; col >= row; col--) {
//				System.out.print("* ");
//			}
//			
//			System.out.print("\n");
//		}

		/*************************************************/


		// Shape 1 UP
		for (int row = 0; row < 8; row += 2) {

			for (int blank = 8 - row; blank > 0; blank--)
				System.out.print(" ");
			for (int col = 0; col <= row; col++) {

				System.out.print(" *");
			}
			System.out.println();

		}

//		// Shape 2 DOWN
		for (int i = 9; i >= 0; i -= 2) {

			for (int k = 9 - i; k > 0; k--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++) {

				System.out.print(" *");
			}
			System.out.println();

		}

	}

}
