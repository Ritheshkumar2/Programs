package base;

public class PrimeCheck {

	public static void main(String[] args) {
		test();
		sumOfDigits();

	}

	private static void test() {
		int number = 13;
		boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(number); i++) {
		    if (number % i == 0) {
		        isPrime = false;
		        break;
		    }
		}

		if (isPrime) {
		    System.out.println("Given number is a prime");
		} else {
		    System.out.println("Given number is not a prime");
		}
	}
	
	public static void sumOfDigits() {
		int number = 1234;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;   // get the last digit
            sum += digit;              // add it to sum
            number = number / 10;      // remove the last digit
        }

        System.out.println("Sum of digits = " + sum);
    }
	

}
