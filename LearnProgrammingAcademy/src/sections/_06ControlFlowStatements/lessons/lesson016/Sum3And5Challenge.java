package sections._06ControlFlowStatements.lessons.lesson016;

public class Sum3And5Challenge {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 3 ==0 && i % 5 ==0 ) {
				sum += i;
				count ++;
				System.out.println(i + " is divisible by both 3 and 5.");
				if(count == 5) {
					break;
				}
			}
		}
		
		System.out.println("The sum of the numbers found is: " + sum);
	}

}
