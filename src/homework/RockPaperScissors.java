package homework;

import java.util.Scanner;

/**
 * Rock, paper, scissors!
 * 
 * Asks for player one’s move Asks for player two’s move Declares the winner!
 * 
 * @author Crystal Panter
 *
 */
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Player One's Choice:");
		String playerOne = scanner.nextLine();
		System.out.println("Player Two's Choice:");
		String playerTwo = scanner.nextLine();

		// Rock, Paper, and Scissors
		// Rock beats Scissors
		// Scissors beat paper
		// Paper beats Rock
		// ties
		// invalid

		////////// if either player picked rock//////
		if (playerOne.toLowerCase().equals("rock")) {
			// player 1 wins if player 2 = scissors
			if (playerTwo.toLowerCase().equals("scissors")) {
				System.out.println("Player 1 Wins");
			}
		}
		if (playerTwo.toLowerCase().equals("rock")) {
			if (playerOne.toLowerCase().equals("scissors")) {
				System.out.println("Player 2 wins");
			}
		}
		/////////////////////////////////////
		// scissors beats paper
		if (playerOne.toLowerCase().equals("scissors")) {
			if (playerTwo.toLowerCase().equals("paper")) {
				System.out.println("Player One Wins!");
			}
		}
		if (playerTwo.toLowerCase().equals("scissors")) {
			if (playerOne.toLowerCase().equals("paper")) {
				System.out.println("Player Two Wins!");
			}
		}
		/////////////////////////////////////
		// paper beats rock
		if (playerOne.toLowerCase().equals("paper")) {
			if (playerTwo.toLowerCase().equals("rock")) {
				System.out.println("Player One Wins!");
			}
		}
		if (playerTwo.toLowerCase().equals("paper")) {
			if (playerOne.toLowerCase().equals("rock")) {
				System.out.println("Player Two Wins!");
			}
		}
		/////////////////////////////////////
		else {
			// no one wins - ties and invalids
			System.out.println("No one wins");
		}

	}

}
