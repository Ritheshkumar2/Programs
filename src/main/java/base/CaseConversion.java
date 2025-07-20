package base;

public class CaseConversion {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		
		String input="JaVa PrograMMINg";
		StringBuilder result=new StringBuilder();
		
		for(char c:input.toCharArray()) {
			if(Character.isUpperCase(c)) {
				result.append(Character.toLowerCase(c));
			}else if(Character.isLowerCase(c)) {
				result.append(Character.toUpperCase(c));
			}else {
				result.append(c);
			}
		}
		System.out.print(result);
		
	}
}
