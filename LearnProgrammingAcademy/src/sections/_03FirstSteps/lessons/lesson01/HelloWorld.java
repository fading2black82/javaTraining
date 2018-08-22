package sections._03FirstSteps.lessons.lesson01;

public class HelloWorld {
	public static void main(String[] args) {
		
		System.out.println("Hello Matt!");
		int myFirstNumber = (10 + 5) + (2 * 10);
		int mySecondNumber = 12;
		int myThirdNumber = myFirstNumber * 2;
		
		int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
		
		int myFourthNumber = 1000 - myTotal;
		
		System.out.println(myFourthNumber);
	}
}
