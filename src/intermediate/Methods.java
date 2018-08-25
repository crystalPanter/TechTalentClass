package intermediate;

public class Methods {

	public static void main(String[] args) {
		System.out.println(addItUp());
		int age = 26;
		System.out.println(age);
		
		int num1 = 10;
		int num2 = 42;
		System.out.println(addThings(addItUp(),num2));
		
	}
	
	public static int addThings(int a, int b) {
		return a+b;
	}

	public static void sayHello() {
		System.out.println("Hello Everyone!");
	}

	public static void reallyHardMath() {
		double answer = 25;
		System.out.println(answer);
	}
	
	public static int addItUp() {
	    int a = 2;
	    int b = 4;
	    sayHello();
		return a+b;
	}
	
	

}
