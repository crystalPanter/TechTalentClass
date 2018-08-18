/**
 * Usually copyright stuff goes up here
 */
package basics;

import java.util.Random;

/**
 * @author Crysal
 *
 */
public class HelloNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(100);
		System.out.println("Hello. Here is a number: " + number);

	}

}
