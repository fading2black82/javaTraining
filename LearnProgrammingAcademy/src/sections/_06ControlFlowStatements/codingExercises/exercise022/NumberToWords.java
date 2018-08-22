package sections._06ControlFlowStatements.codingExercises.exercise022;

public class NumberToWords {
	public static void main(String[] args) {
		int i = 0;
//		System.out.println("Returned value: " + reverse(i));
		numberToWords(i);
	}
	
	public static void numberToWords(int number) {
		if(number < 0) {
			System.out.println("Invalid Value");
		}
		int length = getDigitCount(number);
		int reversed = reverse(number);
		for(int i = 1; i <= length; i++) {
			int digit = reversed % 10;
			if(digit > 0) {
				switch(digit) {
				case 1:
					System.out.print("One ");
					break;
				case 2:
					System.out.print("Two ");
					break;
				case 3:
					System.out.print("Three ");
					break;
				case 4:
					System.out.print("Four ");
					break;
				case 5:
					System.out.print("Five ");
					break;
				case 6:
					System.out.print("Six ");
					break;
				case 7:
					System.out.print("Seven ");
					break;
				case 8:
					System.out.print("Eight ");
					break;
				case 9:
					System.out.print("Nine ");
					break;
				default:
					System.out.print("Zero ");
				}				
			}
			else {
				System.out.print("Zero ");
			}
			reversed /= 10;
		}
	}
	
	public static int reverse(int num) {
		int length = 0;
		if(num < 0) {
			length = getDigitCount(-num);
		}
		else {
			length = getDigitCount(num);
		}
		int reversed = 0;
		int converted = 0;
		while(num != 0) {
			converted = (num % 10);
			for(int i = 1; i < length; i++) {
				converted *=10;
			}
			length--;
			num /= 10;
			reversed += converted;
		}
		return reversed;
	}
	
	public static int getDigitCount(int a) {
		int count = 0;
		if(a < 0) {
			return -1;
		}
		else if(a == 0) {
			return 1;
		}
		while(a > 0) {
			count++;
			a /=10;
		}
		return count;
	}

}
