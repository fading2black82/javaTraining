package sections._06ControlFlowStatements.lessons.lesson017;

public class While {
	public static void main(String[] args) {
//	int count = 1;
//	while(count != 6) {
//		System.out.println("Count value is " + count);
//		count++;
//	}
//	
//	for(int i = 6; i != 6; i++) {
//		System.out.println("Count value is " + count);
//	}
//	
//	count = 1;
//	do {
//		System.out.println("Count value was " + count);
//		count++;
//		
//		if(count > 100) {
//			break;
//		}
//	} while(count != 6);
	
	int number = 4;
	int finishNumber = 20;
	int whileCount = 0;
	
	while(number <= finishNumber) {
		number++;
		if(!isEvenNumber(number)) {
			continue;
		}
		System.out.println("Even number: " + number);
		whileCount++;
		if(whileCount >= 5) {
			break;
		}
	}
	System.out.println(whileCount + " even numbers were found");
}

public static boolean isEvenNumber(int number) {
	if((number % 2) != 0) {
		return false;
	}
	return true;
}

}
