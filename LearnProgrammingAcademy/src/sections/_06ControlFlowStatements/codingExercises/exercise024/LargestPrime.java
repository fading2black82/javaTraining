package sections._06ControlFlowStatements.codingExercises.exercise024;

public class LargestPrime {
	public static void main(String[] args) {
		int i = 400;
		System.out.println("The largest Prime Number of " + i + " is " + getLargestPrime(i));
	}
	
	public static int getLargestPrime(int number) {
		if(number < 2) {
			return -1;
		}
		int factor = 0;
		int prime = 0;
		int factorCount = 0;
		
		for(int i = 1; i <= number; i++) {
			if((number % i) == 0) {
				factor = i;
				for(int n = 2; n < factor; n++) {					
					if(factor % n == 0) {
						factorCount++;
					}
				}
				if((factorCount == 0) && (factor >= 2)) {
					prime = factor;
				}
			}
		}		
		return prime;
	}

}
