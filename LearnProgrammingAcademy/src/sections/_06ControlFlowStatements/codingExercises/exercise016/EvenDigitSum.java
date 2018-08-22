package sections._06ControlFlowStatements.codingExercises.exercise016;

public class EvenDigitSum {
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(4226));
		
//			System.out.println(sum);

		}
		
		public static int getEvenDigitSum(int number) {
			if(number < 0) {
				return -1;
			}
				int sum = 0;
									
				while(number > 0) {
					int n = number % 10;
					if((n % 2) == 0) {
						sum += n;
					}
					number /= 10;								
				}
				return sum;
		}

	}
