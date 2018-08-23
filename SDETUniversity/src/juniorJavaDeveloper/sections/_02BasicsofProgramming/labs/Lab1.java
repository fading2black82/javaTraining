package juniorJavaDeveloper.sections._02BasicsofProgramming.labs;

public class Lab1 {
	public static void main(String[] args) {
		// 1. Write a function that takes a value n returns the sum of numbers 1 to n
		System.out.println("Answer 1: " + sum(4));

		// 2. Write a function that computes the factorial value
		System.out.println("Answer 2: " + factorial(5));

		// 3. Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array
		int[] numbers = {5, -2, 0, 234, -438, 63};
		System.out.println("Answer 3 (min): " + findMin(numbers));
		System.out.println("Answer 3 (max): " + findMax(numbers));
		System.out.println("Answer 3 (avg): " + findAvg(numbers));
	}

	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			// System.out.print(sum + " + " + i);
			sum = sum + i;
			// System.out.println(" = " + sum);
		}
		return sum;
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		// System.out.println(n);
		return factorial(n - 1) * n;
	}

	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int findAvg(int[] arr) {
		// Take sum, divide by number of elements
		int sum = 0;
		for (int n = 0; n < arr.length; n++) {
			sum = sum + arr[n];
		}
		// System.out.println("Sum: " + sum);
		// System.out.println("Length: " + arr.length);
		return sum / arr.length;
	}
}
