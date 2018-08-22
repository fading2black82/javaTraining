package sections._06ControlFlowStatements.codingExercises.exercise017;

public class SharedDigit {
	public static void main(String[] args) {
		if(hasSharedDigit(97, 19)) {
			System.out.println("Values have a shared number.");
		}
		else {
			System.out.println("No match");
		}

	}
	
	public static boolean hasSharedDigit (int numOne, int numTwo) {
		if((numOne < 10) || (numOne > 99) || (numTwo < 10) || (numTwo > 99)) {
			return false;
		}
		int i = numTwo;
		
		while(numOne > 0) {
			int firstComparitor = numOne % 10;
//			System.out.println("first: " + firstComparitor);
			while(i > 0) {
				int secondComparitor = i % 10;
//				System.out.println("second: " + secondComparitor);
				if(firstComparitor == secondComparitor) {
					return true;
				}
				i /= 10;				
			}
			i = numTwo;
			numOne /= 10;
		}
		return false;		
	}

}
