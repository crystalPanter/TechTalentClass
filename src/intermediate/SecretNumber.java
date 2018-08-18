package intermediate;

import java.util.Scanner;

/**
 * Hint: Declare your secret number Set a default for the user’s guess While the
 * user’s guess is not your secret number Ask the user for a guess If the user
 * guesses your number Print YOU WIN Otherwise Print nope that’s wrong
 * 
 * @author Crystal
 *
 */
public class SecretNumber {

	public static void main(String[] args) {
		int secretNumber = 42;
		int userGuess = 37;
		while (userGuess != secretNumber) {
			System.out.println("Guess a number: ");
			Scanner scanner = new Scanner(System.in);
			userGuess = scanner.nextInt();
			if (userGuess == secretNumber) {
				System.out.println("YOU WIN");
			} else {
				System.out.println("Nope, thats wrong");
			}
		}

	}
}
