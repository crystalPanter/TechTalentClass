package intermediate;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapsExample {
	public static void main(String[] args) {
		
		HashMap<String,ArrayList<String>> pets = new HashMap<String,ArrayList<String>>();
		ArrayList<String> hamList = new ArrayList<String>();
		ArrayList<String> pigList = new ArrayList<String>();
		ArrayList<String> catList = new ArrayList<String>();
		
		hamList.add("Anastasia");
		pets.put("hamsterNames", hamList);
		
		pigList.add("Mei");
		pigList.add("Orisa");
		pigList.add("Tracer");
		pets.put("pigNames",pigList);
		
		catList.add("Emi");
		pets.put("catNames",catList);
		
		System.out.println(pets);
	}
}
