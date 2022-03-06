package resources;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static int generateRandomNumber() {
		int min = 0;
		int max = 100;
		Random r = new Random();
		int randomNum = r.nextInt(max - min);
		return randomNum + min;
	}

	// guess is higher or lower
	private boolean guessHigherLower(int guess, int randomNumber) {
		if (guess > randomNumber) {
			System.out.println("Your guess is too high");
			return (false);
		}
		if (guess < randomNumber) {
			System.out.println("Your guess is too low");
			return (false);
		}
		return (true);
	}

	public void play() {
		int answer = generateRandomNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");
		int guess;
		do {
			System.out.print("Enter your guess:");
			while (!scanner.hasNextInt()) {
				String input = scanner.next();
				System.out.printf("\"%s\" is not a valid number.%n", input);
				System.out.print("Enter your guess:");
			}
			guess = scanner.nextInt();
		}
		while (!guessHigherLower(guess, answer));
		System.out.printf("Yes, the number is %d 😎", guess);
	}
}
