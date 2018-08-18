package intermediate;

import java.util.HashMap;
import java.util.Map;

public class Loops {

	public static void main(String[] args) {
		for (int num = 0; num < 10; num++) {
			System.out.println(num);
		}

		int count = 0;
		while (count < 5) {
			System.out.println(count);
			count++;
		}

		String[] favoriteFood = { "Caramel", "Mochi", "Cheese Danish", "Birthday Cake Uce Cream" };

		for (String eachFood : favoriteFood) {
			System.out.println(eachFood);
		}

		HashMap<String, Integer> familyAges = new HashMap<String, Integer>();
		familyAges.put("Husband", 25);
		familyAges.put("Wife", 26);
		familyAges.put("Cat", 1);
		familyAges.put("Hamster", 2);

		for (Map.Entry<String, Integer> eachEntry : familyAges.entrySet()) {
			System.out.println("Family member: " + eachEntry.getKey() + " - Age: " + 
					eachEntry.getValue());
		}
	}
}
