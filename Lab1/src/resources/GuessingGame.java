package resources;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	private int generateRandomNumber() {
		Random rand = new Random();
		int upperbound = 100;
		return rand.nextInt(upperbound);
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
			}
			guess = scanner.nextInt();
		}
		while (!guessHigherLower(guess, answer));
		System.out.printf("Yes, the number is %d 😎", guess);
	}
}
