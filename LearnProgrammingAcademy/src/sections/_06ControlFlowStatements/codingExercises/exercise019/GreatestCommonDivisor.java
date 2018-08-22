package sections._06ControlFlowStatements.codingExercises.exercise019;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		int test = getGreatestCommonDivisor(12, 30);
		if(test == -1) {
			System.out.println("Invalid Entry");
		}
		else {
			System.out.println("Greatest Common Divisor = " + test);
		}
	}
	
	public static int getGreatestCommonDivisor(int first, int second) {
		if((first < 10) || (second < 10)) {
			return -1;
		}
		int smaller = 0;
		int larger = 0;
		
		if(first > second) {
			larger = first;
			smaller = second;
		}
		else {
			larger = second;
			smaller = first;
		}
		for(int i = smaller; i > 0; i--) {
			if(((larger % i) == 0) && ((smaller % i) == 0)) {
				return i;
			}
		}		
		return -1;
	}

}
