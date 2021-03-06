package sections._07OOPPart1ClassesConstructorsAndInheritance.lessons.lesson024.Constructors;

public class VipCustomer {
	private String name;
	private double creditLimit;
	private String email;
	
	public VipCustomer() {
		this("Default Name", 1000, "default@test.com");
	}
	
	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "unknown@test.com");
	}
	
	public VipCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}
}
