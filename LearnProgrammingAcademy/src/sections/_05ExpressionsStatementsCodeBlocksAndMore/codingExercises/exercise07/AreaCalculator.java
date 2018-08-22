package sections._05ExpressionsStatementsCodeBlocksAndMore.codingExercises.exercise07;

public class AreaCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static double area(double radius) {
    double result;
    if(radius < 0) {
        result = -1.0;
    }
    else {
        result = radius * radius * 3.14159;
    }
    return result;
	}

	public static double area(double x, double y) {
    double result;
    if( x < 0 || y < 0) {
        result = -1.0;
    }
    else {
        result = x * y;
    }
    return result;
	}

}
