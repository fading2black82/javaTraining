package sections._06ControlFlowStatements.lessons.lesson013;

public class Switch {
	public static void main(String[] args) {
//	int value = 3;
//	if(value == 1) {
//		System.out.println("Value was 1");
//	}
//	else if(value == 2) {
//		System.out.println("Value was 2");
//	}
//	else {
//		System.out.println("Was not 1 or 2");
//	}
	
	int switchValue = 6;
	
	switch(switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;
		case 2:
			System.out.println("Value was 2");
			break;
		case 3:case 4:case 5:
			System.out.println("Was a 3, or a 4, or a 5");
			System.out.println("Actually it was a " + switchValue);
			break;
		default:
			System.out.println("Was not 1,2,3,4 or 5");
			break;
	}
	
	char newCharValue = 'F';
	switch(newCharValue) {
		case 'A':
			System.out.println("Value was A");
			break;
		case 'B':
			System.out.println("Value was B");
			break;
		case 'C':
			System.out.println("Value was C");
			break;
		case 'D':
			System.out.println("Value was D");
			break;
		case 'E':
			System.out.println("Value was E");
			break;
		default:
			System.out.println("Not Found");
	}
	
	String month = "JANUARy";
	switch(month.toLowerCase()) {
		case "january":
			System.out.println("Jan");
			break;
		case "june":
			System.out.println("Jun");
			break;
		default:
			System.out.println("Not Sure");
	}
}
}
