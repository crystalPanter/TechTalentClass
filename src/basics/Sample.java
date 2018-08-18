package basics;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
//		String question = "What is your name?";
//		System.out.println(question);
//		String input = scanner.nextLine();
//		System.out.println("Your name is: " + input);
//		int input2 = scanner.nextInt();
//		System.out.println(input2);
		int secretNumber = 2;
		

		//		System.out.println("Give me an number between 1 and 5");
//		int number = scanner.nextInt();
//		if(number == 1) {
//			System.out.println("You typed 1");
//		} else if(number > 5){
//			System.out.println("Shame on you");
//		}else {
//			System.out.println("That's not 1");
//		}
//		int number = 0;
//		
//		while (number < 5) {
//			System.out.println("AHHH");
//			number = number + 1;
//		}
		
		
		int usersGuess = 0;
		while (usersGuess != secretNumber) {
			System.out.println("Guess again!");
			usersGuess = scanner.nextInt();
		}
		System.out.println("You win!");
	}

}
