package juniorJavaDeveloper.sections._03ObjectOrientedProgramming.lessons.lesson10;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("Rate");
	}

	@Override
	public void increaseRate() {
		System.out.println("Increase rate");
	}

	public void setTerm(int term) {
		System.out.println("Setting the term to: " + term + " years.");
	}

	public void setAmmortSchedule() {
		System.out.println("Ammortization schedule");
	}

}
