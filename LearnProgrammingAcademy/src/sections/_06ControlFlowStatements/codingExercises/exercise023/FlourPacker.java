package sections._06ControlFlowStatements.codingExercises.exercise023;

public class FlourPacker {
	public static void main(String[] args) {
		if(canPack(-3, 2, 12)) {
			System.out.println("A package can be made.");
		}
		else {
			System.out.println("A package cannot be made.");
		}
	}
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
			return false;
		}
		int bigWeight = 5;
		int smallWeight = 1;
		int sum = 0;
		
		for(int i = 1; i <= bigCount; i++) {
			if((sum + bigWeight) <= goal) {
				sum += bigWeight;
			}
			else {
				break;
			}
		}
		for(int i = 1; i <= smallCount; i++) {
			if((sum + smallWeight) <= goal) {
				sum += smallWeight;
			}
			else {
				break;
			}
		}
		if(sum == goal) {
			return true;
		}		
		return false;
	}

}
