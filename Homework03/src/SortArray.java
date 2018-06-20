import java.util.Random;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		int arraySize = getIntInRange("Enter size of array to be generated(20-40): ", 20, 40);
		int[] generatedArray = generateArray(arraySize, 10, 99);
		printArray(generatedArray, "unsorted: ");
		sortArrayAsc(generatedArray);
		printArray(generatedArray, "sorted: ");
	}

	/**
	 * Prompts to enter a value via stdin between specified min and max values. If
	 * entered value is outside the range specified by min/max, then the prompt is
	 * shown again until a valid value is entered.
	 * 
	 * @param message
	 *            to be shown before prompt
	 * @param min
	 *            value(inclusive)
	 * @param max
	 *            value(exclusive)
	 * @return value entered by user
	 */
	public static int getIntInRange(String message, int min, int max) {
		Scanner scanner = new Scanner(System.in);
		int size = -1;
		while (size < min || size > max) {
			System.out.print(message);
			size = scanner.nextInt();
		}

		scanner.close();
		return size;
	}

	/**
	 * Generates array of integers of specified size and values in range of min/max
	 * 
	 * @param size
	 *            of array
	 * @param min
	 *            value of generated random integers(inclusive)
	 * @param max
	 *            value of generated random integers(exclusive)
	 * @return array of specified size filled with random int values
	 */
	public static int[] generateArray(int size, int min, int max) {
		int[] array = new int[size];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(max - min + 1) + min; // min(inclusive) to max(exclusive)
		}
		return array;
	}

	/**
	 * Prints all values from array to stdout separated by comma
	 * 
	 * @param array
	 *            to be printed
	 * @param leadMessage
	 *            message to be shown before array(not null safe)
	 */
	public static void printArray(int[] array, String leadMessage) {
		String message = leadMessage;
		for (int i = 0; i < array.length; i++) {
			message = message + array[i];
			if (i < array.length - 1) {
				message = message + ", ";
			}
		}
		System.out.println(message);
	}

	/**
	 * Sorts elements in provided array in ascending order using bubble sort.
	 * Modifies provided array.
	 * 
	 * @param array
	 *            to be sorted
	 */
	public static void sortArrayAsc(int[] array) {
		int endIndex = array.length;
		boolean swapped = false;
		while (true) {
			swapped = false;
			for (int i = 1; i < endIndex; i++) {
				if (array[i - 1] > array[i]) { // if needed exchange elements in array with tmp variable
					int tmp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = tmp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
			endIndex--; // last element in current loop is always guaranteed to be in it's final place
		}
	}

}
