package sections._06ControlFlowStatements.codingExercises.exercise012;

public class NumberOfDaysInMonth {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isLeapYear(int year) {
    if(year < 1 || year > 9999) {
        return false;
    }
    else if(year % 4 == 0 && year % 100 != 0) {
        return true;
    }
    else if(year % 400 == 0) {
        return true;
    }
    else {
        return false;
    }
	}

	public static int getDaysInMonth (int month, int year) {
    boolean leapYear = isLeapYear(year);
    if(month < 1 || month > 12) {
        return -1;
    }
    else if(year < 1 || year > 9999) {
        return -1;
    }
    else if(leapYear && month == 2) {
        return 29;
    }
    else {
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 28;
        }
    }
	}

}
