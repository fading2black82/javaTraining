package lessons;

import java.util.Scanner;

public class Lesson022_MinimumAndMaximumChallenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int min = 0;
//		int max = 0;
//		int counter = 1;
//		boolean first = true;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
				
		while(true) {
			System.out.print("Enter number: ");
			boolean isInt = scanner.hasNextInt();
			if(isInt) {
				int value = scanner.nextInt();
//				if(counter == 1) {
//				if(first) {
//					first = false;
//					min = value;
//					max = value;
//				}
				if(value < min) {
					min = value;
				}
				if(value > max) {
					max = value;
				}
			}
			else {
				break;
			}
//			counter++;
			scanner.nextLine();
		}
		System.out.println("Minimum value entered was: " + min);
		System.out.println("Maximum value entered was: " + max);
		scanner.close();
	}

}