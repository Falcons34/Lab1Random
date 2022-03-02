import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		// Create a new instance of the GuessingGame class
		GuessingGame game;
		game = new GuessingGame();
		// Call the play method
		game.play();

	}
	private int generateRandomNumber() {
		Random rand = new Random();
		int upperbound = 10;
		return rand.nextInt(upperbound);
	}
// guess is higher or lower
	private boolean guessHigherLower(int guess, int randomNumber) {
		if (guess > randomNumber) {
			System.out.println("Your guess is too high");
			return(false);
		} if (guess < randomNumber) {
			System.out.println("Your guess is too low");
			return(false);
		}
		return(true);
	}

	private void play() {
		int answer = generateRandomNumber();
		int guess = -1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");
		do{
			System.out.print("Enter your guess:");
			while (!scanner.hasNextInt()) {
				String input = scanner.next();
				System.out.printf("\"%s\" is not a valid number.%n", input);
			}
			guess = scanner.nextInt();
		}
		while(!guessHigherLower(guess, answer));
		System.out.printf("Yes, the number is %d 😎", guess);
	}
}
