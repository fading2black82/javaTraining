package juniorJavaDeveloper.sections._05ExceptionsAndFileHandling.labs.PhoneNumberApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This will read a text file and will retrieve phone number
		
		String filename = "C:\\Users\\bauld\\eclipse\\JavaTrainingWorkspaces\\Projects\\SDETUniversity\\Files\\PhoneNumber.txt";
		File file = new File(filename);
		String[] phoneNums = new String[9];
		String phoneNum = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < phoneNums.length; i++) {
				phoneNums[i] = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File Not Found");
		} catch (IOException e) {
			System.out.println("ERROR: Could Not Read File");
		}
		
		for (int i = 0; i < phoneNums.length; i++) {
			// Valid Phone Number: 
			phoneNum = phoneNums[i];
			try {
				// 10 digits long
				if (phoneNum.length() != 10) {
					throw new TenDigitsException(phoneNum);
				}
				// Area code cannot start in 0 or 9
				if ((phoneNum.substring(0, 1).equals("0")) || (phoneNum.substring(0, 1).equals("9"))) {
					throw new AreaCodeException(phoneNum);
				}
				// There can be no 911 in the phone
				for (int n = 0; n < phoneNum.length() - 2; n++) {
					if (phoneNum.substring(n, n + 1).equals("9")) {
						if (phoneNum.substring(n + 1, n + 3).equals("11")) {
							throw new EmergencyException(phoneNum);
						}
					}
				}
				System.out.println(phoneNum);
			} catch (TenDigitsException e ) {
				System.out.println("ERROR: Phone Number Is Not 10 Digits");
				System.out.println(e.toString());
			} catch (AreaCodeException e) {
				System.out.println("ERROR: Phone Number Has Invalid Area Code");
				System.out.println(e.toString());
			} catch (EmergencyException e) {
				System.out.println("ERROR: Invalid 911 Sequence Found");
				System.out.println(e.toString());
			}
		}
	}

}
class TenDigitsException extends Exception {
	String num;
	TenDigitsException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("TenDigitsException: " + num);
	}
}
class AreaCodeException extends Exception {
	String num;
	AreaCodeException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("AreaCodeException: " + num);
	}
}
class EmergencyException extends Exception {
	String num;
	EmergencyException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("EmergencyException: " + num);
	}
}