package day4;

public class Array1D {

	public static void main(String[] args) {
		int[] ints = { 100 };

		System.out.println("ints[0]: " + ints[0]);
		ints[0] = 200;
		System.out.println("ints[0]: " + ints[0]);

		int[] emptyInts = new int[100];
		System.out.println(emptyInts);

		String[] strings = { "aaa", "bbb" };

		for (String s : strings) {
			System.out.println(s);
		}

		
		/**
		 * Next code splits string by space, filters out empty stings and adds non empty strings to array
		 */
		String input = "     fiRsTNamE   suRNAme1 anoTherSurname  MORE";
		String[] chars = input.split(" ");
		
		int part = 0; // we assume we will have one part(zero index of array)

		String[] target = new String[1]; // array to collect strings
		
		for (String s : chars) {
			
			// collect onlu non empty strings
			if (s.length() != 0) {
				// check if we are at the limit of current array
				if (target.length == part) { 
					System.out.println("Need to extend arrat");
					String[] newArray = new String[target.length + 1]; // define array with oldSize+1
					System.arraycopy(target, 0, newArray, 0, target.length); // copy old values to newArray
					target = newArray; // set tatger array to point to newArray
				}
				
				target[part] = s; // add new string to end of array
				part++; // increment parts count
				
				System.out.println("part: '" + s + "'");
			}
		}

		// System.out.println("parts: " + parts);
		
		for (int i = 0; i < target.length; i++) {
			if (i == 0) {
				target[i] = 
						target[i].substring(0, 1).toUpperCase() 
						+ target[i].substring(1, target[i].length()).toLowerCase() ;
				
			} else {
				target[i] = target[i].toUpperCase();
			}
		}
		
		for (String t : target) {
			System.out.println(t);
		}

	}

}
