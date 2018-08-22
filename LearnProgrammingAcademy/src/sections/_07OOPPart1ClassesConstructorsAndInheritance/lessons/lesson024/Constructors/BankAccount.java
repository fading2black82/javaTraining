package sections._07OOPPart1ClassesConstructorsAndInheritance.lessons.lesson024.Constructors;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public BankAccount() {
		this("987654321", 2.50, "Default Name", "Default Email", "Default Phone");
		System.out.println("Empty constructor call");
	}
	
	public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
		System.out.println("Account constructor with paramaters called.");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}	
	
	public BankAccount(String customerName, String email, String phoneNumber) {
		this("321654987", 100.55, customerName, email, phoneNumber);
	}

	public double depositFunds(double amount) {
		this.balance += amount;
		System.out.println("Deposit of " + amount + " Was Successful");
		return this.balance;
	}
	
	public double withdrawFunds(double amount) {
		if((this.balance - amount) < 0) {
			System.out.println("Insufficient Funds");
			return this.balance;
		}
		else {
			this.balance -= amount;
			System.out.println("Withdrawal of " + amount + " Was Successful");
			return this.balance;
		}
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName() {
		return this.customerName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}	
}
