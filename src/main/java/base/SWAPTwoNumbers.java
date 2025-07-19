package base;

public class SWAPTwoNumbers {
	public static void main(String[] args) {
		test();
		test2();
		
	}

	private static void test2() {
		int a=1,b=2;
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println(a+" "+b);
		
	}

	private static void test() {
		
		int a=1,b=2;
		
		System.out.print("Before"+a+" "+b);
		System.out.println("");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("After "+a+" "+b);
		System.out.println("");
		
	}
}
