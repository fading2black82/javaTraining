package sections._06ControlFlowStatements.codingExercises.exercise015;

public class FirstLastDigitSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int sumFirstAndLastDigit(int number) {
    if(number < 0) {
        return - 1;
    }
    int last = number % 10;
    int first = number;
    int sum = 0;

    while((first / 10) > 0) {
	    first = first / 10;
    }

    sum = first + last;
    return sum;    
	}

}
