package codingExercises;

public class Exercise002_BarkingDog {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean bark(boolean barking, int hourOfDay) {
    if(!barking || hourOfDay < 0 || hourOfDay > 23) {
        return false;
    }
    else if(barking && (hourOfDay < 8 || hourOfDay > 22)) {
        return true;
    }
    else {
        return false;
    }
	}
}
