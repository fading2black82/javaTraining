package lessons;

public class Lesson010_Methods {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);
		
		highScore = calculateScore(true, 10000, 8, 200);
		System.out.println("Your final score was " + highScore);
		
		String playerName = "Player1";
		int playerScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition(playerName, playerScorePosition);
		
		playerName = "Player2";
		playerScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition(playerName, playerScorePosition);
		
		playerName = "Player3";
		playerScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition(playerName, playerScorePosition);
		
		playerName = "Player4";
		playerScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition(playerName, playerScorePosition);
		
		playerName = "Player5";
		playerScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition(playerName, playerScorePosition);
		
		playerName = "Player6";
		playerScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition(playerName, playerScorePosition);
		
		playerName = "Player7";
		playerScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition(playerName, playerScorePosition);
	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
	}
	
	public static void displayHighScorePosition(String name, int position) {
		System.out.println(name + " managed to get into position " + position + " on the high score table");
	}
	
	public static int calculateHighScorePosition(int score) {
//		if(score >= 1000) {
//			return 1;
//		}
//		else if(score >= 500){
//			return 2;
//		}
//		else if(score >= 100) {
//			return 3;
//		}
//		return 4;
		int position = 4; // assuming position 4 will be returned
		
		if(score >= 1000) {
			position = 1;
		}
		else if(score >= 500) {
			position = 2;
		}
		else if(score >= 100) {
			position = 3;
		}
		return position;
	}
}
