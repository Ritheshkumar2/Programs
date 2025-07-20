package base;

public class StringLengthWithiutLength {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		String str = "automation";
		int length = 0;
		
		for (char c : str.toCharArray()) {
		    length++;
		}
		System.out.print(length);

	}
}
