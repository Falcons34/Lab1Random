import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int userChoice = 0;
		System.out.println("Welcome to week 1 Labs");
		while(userChoice != 5){
			userChoice = menu();
			switch (userChoice) {
				case 1 -> {
					GuessingGame game = new GuessingGame();
					game.play();
					pause();
				}
				case 2 -> {
					CircleCal calc = new CircleCal();
					calc.run();
					pause();
				}
				case 3 -> {
					PrintLoop lopper = new PrintLoop();
					lopper.Run();
					pause();
				}
				case 4 -> {
					InitialMaker initMaker = new InitialMaker();
					initMaker.run();
					pause();
				}
				case 5 -> System.out.println("Exiting");
			}
	}

	}	private static void pause() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			System.err.format("IOException: %s%n", e);
		}
	}
	public static int menu() {
//		Selection menu class
		int selection;
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("Choose from these choices");
			System.out.println("1 - Play Number guessing game");
			System.out.println("2 - Print Degrees Radians Sine Cosine Tangent");
			System.out.println("3 - print numbers in a pattern");
			System.out.println("4 - computes your initials");
			System.out.println("5 - Quit");
		}while(!input.hasNextInt());
		selection = input.nextInt();
		return selection;
	}
}
