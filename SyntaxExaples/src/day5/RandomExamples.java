package day5;

import java.util.Random;

public class RandomExamples {

	public static void main(String[] args) {
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			int randomInt = rnd.nextInt(10);
			System.out.println("randomInt: " + randomInt);
		}

	}
}
