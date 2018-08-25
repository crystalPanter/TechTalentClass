package intermediate;

public class LbsToKilo {

	public static void main(String[] args) {
		int myWeight = 140;
		System.out.println(lbsToKg(myWeight));
	}
	
	//Convert pounds to kilograms
	//1 pound = .5 kilograms
	/**
	 * make a method that takes in a number of pounds
		then inside of the method we want to
	multiple that by .5
	and return that number
	 * @param pounds
	 * @return
	 */
	public static double lbsToKg(int pounds) {
		return pounds * .5;
	}
	

}
