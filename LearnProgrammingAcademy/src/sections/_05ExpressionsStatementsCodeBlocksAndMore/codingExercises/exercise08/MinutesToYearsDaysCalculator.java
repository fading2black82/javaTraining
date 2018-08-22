package sections._05ExpressionsStatementsCodeBlocksAndMore.codingExercises.exercise08;

public class MinutesToYearsDaysCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void printYearsAndDays(long minutes) {
    if(minutes < 0) {
        System.out.println("Invalid Value");
    }
    else {
        long years = minutes / 525600;
        long remainingMinutes = minutes % 525600;
        long days = remainingMinutes / 1440;
        String yearsString = years + " y and ";
        String daysString = days + " d";
        String minutesString = minutes + " min = ";
        
        System.out.println(minutesString + yearsString + daysString);
    }
	}

}
