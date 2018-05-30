package day4;

public class Array2D {

	public static void main(String[] args) {

		// @formatter:off
		int arr[][] = { // create 3x3 array
				{ 2, 7, 9 }, 
				{ 3, 6, 1 }, 
				{ 7, 4, 2 } 
			};
		// @formatter:on

		for (int i = 0; i < arr.length; i++) { // go over lines
			int[] singleDimArray = arr[i]; // each line is a single dimension array
			for (int j = 0; j < singleDimArray.length; j++) { // go over each element of line
				System.out.print(arr[i][j] + " ");
				// does the same as line above
				// System.out.print(singleDimArray[j] + " ");
			}
			System.out.println(); // add new line between each line
		}
	}

}
