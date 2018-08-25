package homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hint:
Store a default number bigger than 5
While that number is not less than five
	Ask the user for a number
	If that number is less than five
		Break out of the loop
	Otherwise,
		Tell the user to follow the rules
Make an arraylist
Start at 1, the number is the user’s number (for)
	Add that number to the arraylist
For each number in the arraylist
	Print out number * number
 * @author Crystal
 *
 */
public class Loops {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userNumber = 6;
		while(userNumber > 5) {
			System.out.println("Give us a number less than 5:");
			userNumber = scanner.nextInt();
			if(userNumber < 5) {
				break;
			}
			else {
				System.out.println("Follow the rules!Less than 5!");
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int number = 1; number < userNumber; number++) {
			list.add(number);
		}
		
		for(int eachNumber: list) {
			System.out.println(eachNumber*eachNumber);
		}
		
		
	}

}
