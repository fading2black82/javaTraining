package codingExercises;

public class Exercise006_TeenNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean hasTeen(int a, int b, int c) {
    if(a > 12 && a < 20) {
        return true;
    }
    else if(b > 12 && b < 20) {
        return true;
    }
    else if(c > 12 && c < 20) {
        return true;
    }
    else {
        return false;
    }
	}

}
