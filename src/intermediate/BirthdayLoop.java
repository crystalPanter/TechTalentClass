package intermediate;

/**
 * For your birth year, each year, until 2018 
 * Print the year 
 * If the year is 2017
 * Print happy belated birthday
 * 
 * @author Crystal
 *
 */
public class BirthdayLoop {

	public static void main(String[] args) {
		for(int year = 1992; year < 2018; year++) {
			System.out.println(year);
			if(year == 2017) {
				System.out.println("Happy Belated Birthday");
			}
		}
	}

}
