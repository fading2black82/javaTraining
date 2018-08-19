package lesson024_Constructors;

public class Main {

	public static void main(String[] args) {
//		BankAccount acc1 = new BankAccount();//"123456789", 0, "Matt Ritter", "mritter@test.com", "3216540987");
//		
//		System.out.println("Current balance: " + acc1.getBalance());
//		acc1.depositFunds(100);
//		System.out.println("Current balance: " + acc1.getBalance());
//		acc1.withdrawFunds(150);
//		System.out.println("Current balance: " + acc1.getBalance());
//		acc1.withdrawFunds(50);
//		System.out.println("Current balance: " + acc1.getBalance());
//		
//		BankAccount acc2 = new BankAccount("Jimbob Jones", "jimbob@test.com", "(123) 456-7890");
//		System.out.println(acc2.getAccountNumber() + " name " + acc2.getCustomerName());
		
		VipCustomer customer1 = new VipCustomer();
		System.out.println(customer1.getName());
		VipCustomer customer2 = new VipCustomer("Matt", 25000);
		System.out.println(customer2.getName());
		VipCustomer customer3 = new VipCustomer("Jim", 100, "jim@test.com");
		System.out.println(customer3.getName());
		System.out.println(customer3.getEmail());
	}

}
