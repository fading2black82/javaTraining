package sections._06ControlFlowStatements.lessons.lesson018;

public class DigitSumChallenge {
	public static void main(String[] args) {
		System.out.println(sumDigits(125));
		System.out.println(sumDigits(-125));
		System.out.println(sumDigits(5));
		System.out.println(sumDigits(32123));					
	}
	
	public static int sumDigits(int number) {
		int sum = 0;
		int n = number;
		
		if(number < 10) {
			System.out.print("Invalid entry: " + number + "; result: ");
			return -1;
		}
		
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.print("The sum of the digits in " + number + " is: ");
		return sum;
	}	
}
