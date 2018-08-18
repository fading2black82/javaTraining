package codingExercises;

public class Exercise014_NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isPalindrome(int number) {
    int reverse = 0;
    int n = number;

    while(n != 0) {
	    reverse *= 10;
        reverse += n % 10;
        n /= 10;
    }
    
    if(number == reverse) {
	    return true;
    }
    return false;
	}

}
