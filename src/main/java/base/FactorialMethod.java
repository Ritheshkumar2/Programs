package base;

public class FactorialMethod {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		
		int num=5;
		int factorial1=1;
		
		for(int i=1;i<=num;i++) {
			factorial1 = factorial1*i;
		}
		
		System.out.print(factorial1);
	}

}
