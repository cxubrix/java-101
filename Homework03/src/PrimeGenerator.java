
public class PrimeGenerator {

	public static void main(String[] args) {
		int primesCount = SortArray.getIntInRange("How many primes you want to generate? (0-100): ", 0, 100);
		System.out.println("Generating " + primesCount + " consequent prime numbers starting from 1");
		int[] primes = generatePrimes(primesCount);
		SortArray.printArray(primes, "Primes: ");
	}

	private static int[] generatePrimes(int count) {

		if (count == 0) {
			return new int[0];
		}

		int[] primes = new int[count];

		if (count > 0) {
			primes[0] = 1;
		}

		if (count > 1) {
			primes[1] = 2;
		}

		if (count > 2) { // if we need more than 2 primes then generate
			generateHigherPrimes(primes);
		}
		return primes;
	}

	private static void generateHigherPrimes(int[] primes) {
		for (int i = 2; i < primes.length; i++) {
			boolean found = false;
			int nextPossiblePrime = primes[i - 1]; // take last prime
			while (!found) {
				// even numbers greater than 2 are not primes, add 2 to last prime
				nextPossiblePrime += (nextPossiblePrime == 2 ? 1 : 2);
				found = checkPrime(primes, nextPossiblePrime);
				if (found) { // yes, it is prime number
					primes[i] = nextPossiblePrime;
				}
			}

		}
	}

	private static boolean checkPrime(int[] primes, int nextPossiblePrime) {
		// loop until element in array is not zero, which means end of found primes
		for (int i = 2; i < primes.length && primes[i] != 0; i++) {
			// check only against existing primes until value is 1/2 of previous prime
			if (nextPossiblePrime % primes[i] == 0 && 2 * primes[i] < nextPossiblePrime) {
				return false;
			}
		}
		return true;
	}
}
