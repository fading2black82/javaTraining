package lessons;

import java.util.Scanner;

public class Lesson021_ReadingUserInputChallenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int validCount = 1;
		int sum = 0;
		
		while(validCount <= 10) {
			System.out.print("Enter number #" + validCount + ": ");
			boolean hasNextInt = scanner.hasNextInt();
			if(hasNextInt) {
				sum += scanner.nextInt();
				validCount++;
			}
			else {
				System.out.println("Invalid Number");
			}			
			scanner.nextLine();
		}
		System.out.println("The sum of the numbers entered is " + sum + ".");
		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//		
//		int counter = 0;
//		int sum = 0;
//		
//		while(true) {
//			int order = counter + 1;
//			System.out.print("Enter number #" + order + ": ");
//			boolean isAnInt = scanner.hasNextInt();
//			if(isAnInt) {
//				int number = scanner.nextInt();
//				counter++;
//				sum += number;
//				if(counter == 10) {
//					break;
//				}
//			}
//			else {
//				System.out.println("Invalid Number");
//			}
//			scanner.nextLine(); // handle end of line (enter key)
//		}
//		System.out.println("sum = " + sum);
//		scanner.close();
	}
}