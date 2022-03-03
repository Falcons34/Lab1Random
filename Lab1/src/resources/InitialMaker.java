package resources;

import java.util.Scanner;

public class InitialMaker {
	private static String GetInitials(String name) {
		StringBuilder initials = new StringBuilder();
		String[] vales = name.split(" ");
		for (String v : vales) {
			initials.append(v.charAt(0));
		}
		return initials.toString();
	}

	public void run() {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Please enter full name");
		} while (!input.hasNextLine());
		String val = input.nextLine();
		String result = GetInitials(val);
		System.out.printf("Your initials are %s%n", result);
	}
}
