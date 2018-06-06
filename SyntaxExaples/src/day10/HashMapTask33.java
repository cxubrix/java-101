package day10;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask33 {

	public static void main(String[] args) {

		Map<String, Integer> scrabbleMap = new HashMap<>();
		for (int i = 0; i < Letters.values().length; i++) {
			int value = 1;
			if (i > 9 && i < 12) {
				value = 2;
			} else if (i >= 12 && i < 16) {
				value = 3;
			} else if (i >= 16 && i < 21) {
				value = 4;
			} else if (i == 21) {
				value = 5;
			} else if (i == 22 || i == 23) {
				value = 8;
			} else if (i == 24 || i == 25) {
				value = 10;
			}
			scrabbleMap.put("" + Letters.values()[i], value);
		}

		String input = "Cabbage";
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			String key = ("" + input.charAt(i)).toUpperCase();
			int value = scrabbleMap.get(key);
			sum += value;
		}

		System.out.println("input: " + input + " sum: " + sum);

	}

	private enum Letters {
		A, E, I, O, U, L, N, R, S, T,
		// 1
		D, G,
		// 2
		B, C, M, P,
		// 3
		F, H, V, W, Y,
		// 4
		K,
		// 5
		J, X,
		// 8
		Q, Z
		// 10
	}

}
