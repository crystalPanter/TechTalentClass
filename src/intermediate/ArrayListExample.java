package intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>(2);

		System.out.println(names);

		names.add("Elijah");
		names.add("Sadiq");
		names.add("Ricky Brown");

		System.out.println(names);
		System.out.println(names.get(1));

		names.remove(0);
		System.out.println(names);

		System.out.println(names.contains("Sadiq"));
		if (names.contains("Rachelle")) {
			System.out.println("Found her!");
		} else {
			System.out.println("Ooops, adding her now");
			names.add(1, "Rachelle");
		}

		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.isEmpty());
		
		
	}
}
