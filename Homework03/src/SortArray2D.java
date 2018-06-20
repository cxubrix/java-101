import java.util.Random;

public class SortArray2D {

	public static void main(String[] args) {
		int arraysCount = SortArray.getIntInRange("Enter number of arrays to be generated(10-20): ", 10, 20);

		int[][] arrays = new int[arraysCount][];

		Random random = new Random();

		for (int i = 0; i < arraysCount; i++) {
			int size = random.nextInt(41) + 10; // random 10-50
			arrays[i] = SortArray.generateArray(size, 100, 1000);
		}

		double[] avgs = new double[arraysCount];
		for (int i = 0; i < arrays.length; i++) {
			SortArray.sortArrayAsc(arrays[i]); // sort each array
			avgs[i] = calculateAvg(arrays[i]); // calculate average for each array
		}

		int endIndex = avgs.length;
		boolean swapped = false;
		while (true) {
			swapped = false;
			for (int i = 1; i < endIndex; i++) {
				if (avgs[i - 1] > avgs[i]) {

					// exchange averages
					double tmp = avgs[i - 1];
					avgs[i - 1] = avgs[i];
					avgs[i] = tmp;

					// also exchange arrays from 2D array with the same index
					int[] tmpArray = arrays[i - 1];
					arrays[i - 1] = arrays[i];
					arrays[i] = tmpArray;

					swapped = true; // mark that a swap occurred
				}
			}
			if (!swapped) {
				break; // if no swap happened then all is sorted, exit the loop
			}
			endIndex--; // current last element in loop is always guaranteed to be in it's final place
		}

		SortArray.printArray(arrays[arrays.length - 1],
				"Array with higherst average of " + avgs[avgs.length - 1] + ": ");

	}

	private static double calculateAvg(int[] array) {
		long sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum / (double) array.length;
	}

}
