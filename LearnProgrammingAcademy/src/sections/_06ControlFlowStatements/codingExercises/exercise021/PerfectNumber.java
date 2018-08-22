package sections._06ControlFlowStatements.codingExercises.exercise021;

public class PerfectNumber {
	public static void main(String[] args) {
		int n = 28;
		boolean test = isPerfectNumber(n);
		if(!test) {
			System.out.println("Imperfect Number");
		}
		else {
			System.out.println(n + " is a Perfect Number");
		}
	}
	
	public static boolean isPerfectNumber(int number) {
		if(number < 1) {
			return false;
		}
		int sum = 0;
		for(int i = 1; i < number; i++) {
			if((number % i) == 0) {
				sum += i;
			}
		}
		if(sum == number) {
			return true;
		}
		return false;
	}

}
