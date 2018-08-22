package sections._05ExpressionsStatementsCodeBlocksAndMore.lessons.lesson011;

public class MethodOverloading {
	public static void main(String[] args) {
		int newScore = calculateScore("Matt", 500);
		System.out.println("New score is " + newScore);
		calculateScore(75);
		calculateScore();
		double centimeters = calcFeetAndInchesToCentimeters(6, 0);
		if(centimeters < 0.0) {
			System.out.println("Invalid Parameters");
		}
		
		calcFeetAndInchesToCentimeters(157);
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}
	public static int calculateScore() {
		System.out.println("No player name, no player score");
		return 0;
	}
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if((feet < 0) || (inches < 0) || (inches > 12)) {
			System.out.println("Invalid feet or inches paramater");
			return -1;
		}
		else {
			double centimeters = (feet * 12 * 2.54) + (inches * 2.54);
			System.out.println(feet + " feet " + inches + " inches is equal to " + centimeters + " centimeters");
			return centimeters;
		}
	}
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches < 0) {
			return -1;
		}
		else {
			double feet = (int) inches / 12;
			double remainingInches = (int) inches % 12;
			System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
			return calcFeetAndInchesToCentimeters(feet, remainingInches);
		}
	}

}
