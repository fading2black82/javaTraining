package lessons;

public class Lesson005_Strings {

	public static void main(String[] args) {
		// Primitive data types
			// byte
			// short
			// int
			// long
			// float
			// double
			// char
			// boolean
		
		String myString = "This is a string";
		System.out.println(myString);
		myString = myString + ", and this is more.";
		System.out.println(myString);
		myString = myString + " \u00A9 2018";
		System.out.println(myString);
		
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println(numberString);
		
		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println(lastString);
		double doubleNumber = 120.47;
		lastString = lastString + doubleNumber;
		System.out.println(lastString);
		
	}

}