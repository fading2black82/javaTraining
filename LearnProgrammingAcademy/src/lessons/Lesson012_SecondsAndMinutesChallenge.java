package lessons;

public class Lesson012_SecondsAndMinutesChallenge {

	private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
	
	public static void main(String[] args) {
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(-41));
		System.out.println(getDurationString(65,9));
	}
	
	public static String getDurationString(int minutes, int seconds) {
		String response;
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		String hoursString = hours + "h ";
		String minutesString = remainingMinutes + "m ";
		String secondsString = seconds + "s";
		
		if(minutes < 0 || seconds < 0 || seconds > 59) {
			response = INVALID_VALUE_MESSAGE;
		}
		else {
			if(hours < 10) {
				hoursString = "0" + hoursString;
			}
			if(remainingMinutes < 10) {
				minutesString = "0" + minutesString;
			}
			if(seconds < 10) {
				secondsString = "0" + secondsString;
			}
			response = hoursString + minutesString + secondsString;
		}
				return response;
	}
	public static String getDurationString(int seconds) {
		String response;
		if(seconds < 0) {
			response = INVALID_VALUE_MESSAGE;
		}
		else {
			int minutes = seconds / 60;
			int remainingSeconds = seconds % 60;
			response = getDurationString(minutes, remainingSeconds);
		}
		return response;
	}

}
