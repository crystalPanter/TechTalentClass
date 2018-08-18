package homework;

import java.util.Scanner;

/**
 * Decide if a number is even or odd
 * 
 * @author Crystal
 *
 */
public class EvenOddNumbers {

	public static void main(String[] args) {
		//even number = divided by two with no remainders
		//odd number = divided by two with remainders
		
		Scanner scanner = new Scanner(System.in);
		String question = "Enter a number";
		System.out.println(question);
		int number = scanner.nextInt();
		//String number
		
		if(number == 0) {
			//number = 0, 0 is not even or odd
			System.out.println("Neither even nor odd");
		}
		else if(number % 2 == 0) {
			//then it's even
			System.out.println("It's even!");
		}
		else {
			//then it's odd
			System.out.println("It's odd!");
		}

	}

}
