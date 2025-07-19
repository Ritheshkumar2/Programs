package base;

public class PalindromeCheck {

	public static void main(String[] args) {
		test();
		test2();
		
	}
	
	public static void test() {
		String name="Rithesh";
		String reversed = new StringBuilder(name).reverse().toString();
		
		if(name.equalsIgnoreCase(reversed)) {
			System.out.print(" Palindrome");
		}else {
			System.out.print(" Not a Palindrome");
		}
		System.out.println(" ");
	}
	
	public static void test2() {
		
		String name="MOM";
		char[] chars = name.toCharArray();
		String rev= "";
		
		for(int i=chars.length-1;i>=0;i--) {
			rev += chars[i];
		}
		
		if(name.equals(rev)) {
			System.out.print(" Palindrome");
		}else {
			System.out.print(" Not a Palindrome");
		}
	}
}
