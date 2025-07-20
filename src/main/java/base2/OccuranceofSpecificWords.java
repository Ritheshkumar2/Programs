package base2;

import java.util.Arrays;

public class OccuranceofSpecificWords {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		String words="India is my country. my country is india.";
		
	
		String[] word=words.split(" ");
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=word.length-1;i>=0;i--) {
			sb.append(word[i]).append(" ");
		}
		System.out.print(sb);
		System.out.println(" ");
		System.out.print(sb.toString());
		
	}

}
