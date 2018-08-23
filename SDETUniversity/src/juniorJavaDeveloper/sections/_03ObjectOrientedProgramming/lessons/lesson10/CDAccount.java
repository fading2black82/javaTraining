package juniorJavaDeveloper.sections._03ObjectOrientedProgramming.lessons.lesson10;

public class CDAccount extends BankAccount implements IRate {

	String interestRate;

	void compound () {
		System.out.println("Compounding interest");
	}

}
