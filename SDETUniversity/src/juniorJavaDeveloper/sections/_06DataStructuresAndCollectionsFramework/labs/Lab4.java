package juniorJavaDeveloper.sections._06DataStructuresAndCollectionsFramework.labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab4 {

	public static void main(String[] args) {
		// Read a credit card CSV statement
		String filename = "C:\\Users\\bauld\\eclipse\\JavaTrainingWorkspaces\\Projects\\SDETUniversity\\Files\\assignment4.csv";
		String dataRow;
		List<String[]> transactions = new ArrayList<String[]>();
		double balance = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			while ((dataRow = br.readLine()) != null) {
				String[] line = dataRow.split(",");
				transactions.add(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Date | Transaction | Vendor | Amount | Balance");
		for (String[] transaction : transactions) {
			String date = transaction[0];
			String type = transaction[1];
			String vendor = transaction[2];
			double amount = Double.parseDouble(transaction[3]);
			System.out.print(date + " | " + type + " | " + vendor + " | $" + amount);
			
			if (type.equalsIgnoreCase("credit")) {
				//System.out.println("Add to balance");
				balance = balance + amount;
			}
			else if (type.equalsIgnoreCase("debit")) {
				//System.out.println("Subtract from balance");
				balance = balance - amount;
			}
			else {
				//System.out.println("Some other transaction");
			}
			System.out.print(" | " + balance + "\n");
		}
		
		// Check the balance
		if (balance > 0) {
			System.out.println("You have a balance of $" + balance);
			System.out.println("You are charged a 10% fee of $" + (balance * .10));
			balance = balance + (balance * .10);
			System.out.println("Your new balance is $" + balance);
		}
		else if (balance < 0) {
			System.out.println("Thanks for your payment(s).");
			System.out.println("Overpayment of -$" + (balance * -1));
		}
		else {
			System.out.println("Thanks for your payment(s)");
		}
	}
	
}
