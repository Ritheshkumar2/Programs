package base;

public class ReverseWordsInString {

	public static void main(String[] args) {
		test();
		test2();
	}

	private static void test() {
		String input="Jave is programming";
		
		String[] words=input.split(" ");
		StringBuilder result=new StringBuilder();
		
		for(String word:words) {
			StringBuilder reverseResult=new StringBuilder(word);
			reverseResult.reverse();
			result.append(reverseResult).append(" ");
			
		}
		System.out.print(result.toString().trim());
		System.out.println(" ");
		
	}
	
	public static void test2() {
		String input = "Jave is programming";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                result.append(word.charAt(i));
            }
            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }

}
