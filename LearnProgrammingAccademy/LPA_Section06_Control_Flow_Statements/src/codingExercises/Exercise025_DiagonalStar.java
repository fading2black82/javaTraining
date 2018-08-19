package codingExercises;

public class Exercise025_DiagonalStar {

	public static void main(String[] args) {
		for(int i = 1; i < 15; i++) {
			printSquareStar(i);
			System.out.println();
		}
	}
	
	public static void printSquareStar(int number) {
		if(number < 5) {
			System.out.print("Invalid Value");
		}
		else {
			for(int row = 1; row <= number; row++) {
				for(int col = 1; col <= number; col++) {
					if((row == 1) || (row == number) || (col == 1) || (col == number) || (row == col) || (col == (number - row + 1)))	{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}		
	}
}
