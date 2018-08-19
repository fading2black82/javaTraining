package codingExercises;

public class Exercise018_LastDigitChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree ) {
		if((numOne < 10) || (numOne > 1000) || (numTwo < 10) || (numTwo > 1000) || (numThree < 10) || (numThree > 1000)) {
			return false;
		}
		else if((numOne % 10 == numTwo % 10) || (numOne % 10 == numThree % 10) || (numTwo % 10 == numThree % 10)) {
			return true;
		}
		return false;
	}

}
