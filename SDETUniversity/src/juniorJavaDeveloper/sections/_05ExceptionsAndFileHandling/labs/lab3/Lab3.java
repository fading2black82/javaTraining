package juniorJavaDeveloper.sections._05ExceptionsAndFileHandling.labs.lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab3 {

	public static void main(String[] args) {
		String filename = "C:\\Users\\bauld\\eclipse\\JavaTrainingWorkspaces\\Projects\\SDETUniversity\\Files\\TestPasswords.txt";
		String[] passwords = new String[13];
		
		File file = new File(filename);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < passwords.length; i++) {
				passwords[i] = br.readLine();
			}
		} catch (FileNotFoundException e) { System.out.println("ERROR: File Not Found");
		} catch (IOException e) { System.out.println("ERROR: Could Not Read File"); }
		
		for (String password : passwords) {
			System.out.print("****\n" + password + "\n");
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecial = false;
			
			for (int n = 0; n < password.length(); n++) {
				if ("0123456789".contains(password.substring(n,n+1))) { hasNumber = true; }
				else if("abdcefghijklmnopqrstuvwxyz".contains(password.substring(n,n+1).toLowerCase())) { hasLetter = true; }
				else if("!@#$%^&*()_+=".contains(password.substring(n,n+1))) { hasSpecial = true; }
				else {
					try { throw new InvalidException(password.substring(n,n+1)); } 
					catch (InvalidException e) { e.toString(); }
				}
			}
			try {
				if (!hasNumber) { throw new NumberException(password); }
				else if (!hasLetter) { throw new LetterException(password); }
				else if (!hasSpecial) { throw new SpecialException(password); }
				else { System.out.println("Valid Password"); }
			} catch (NumberException | LetterException | SpecialException e) {
				System.out.println("Invalid Password");
				System.out.println(e.toString());
			}
		}
	}
}
class InvalidException extends Exception {
	String ch;
	public InvalidException(String ch) {
		this.ch = ch;
	}
	@Override
  public String toString() {
		return "InvalidCharacterException: " + ch;
	}
}
class NumberException extends Exception {
	String password;
	public NumberException(String password) {
		this.password = password;
	}
	@Override
  public String toString() {
		return "NumberException: " + password;
	}
}
class LetterException extends Exception {
	String password;
	public LetterException(String password) {
		this.password = password;
	}
	@Override
  public String toString() {
		return "LetterException: " + password;
	}
}
class SpecialException extends Exception {
	String password;
	public SpecialException(String password) {
		this.password = password;
	}
	@Override
  public String toString() {
		return "SpecialException: " + password;
	}
}