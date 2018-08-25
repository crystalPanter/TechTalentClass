package intermediate;

import java.util.ArrayList;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse("Word"));

	}

	/**
	 * Create a method that takes a String argument and outputs the String in
	 * reverse.
	 */
	public static String reverse(String word) {
		char[] characters = word.toCharArray();
		// for loop
		// put characters in reverse order
		// get the last character
		// put that first
		// get the second to last
		// put that second,etc.
		ArrayList<Character> drow = new ArrayList<Character>();
		for (int counter = characters.length - 1; counter != -1; counter--) {
			drow.add(characters[counter]);
		}

		String reversedWord = drow.toString();

		return reversedWord;
	}
}
