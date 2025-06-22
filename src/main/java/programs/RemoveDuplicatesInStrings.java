package programs;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesInStrings {

	public static void main(String[] args) {
		RemoveDuplicatesInStrings object=new RemoveDuplicatesInStrings();
		object.removeDuplicates();
		object.setConcept();
	}
	
	public void removeDuplicates() {
		
		String name="abcabcddddcdeeeee";
		
		char[] arr=name.toCharArray();
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i] != arr[i+1]) {
				System.out.print(arr[i]);
			}
		}
		// Print the last character
		System.out.print(arr[arr.length-1]);
		System.out.println("");
	}
	
	public void setConcept() {
		String name = "RitheshKumaR";
	    StringBuilder sb = new StringBuilder();

	    LinkedHashSet<Character> set = new LinkedHashSet<>();
	    for (char ch : name.toCharArray()) {
	        set.add(ch); // set automatically skips duplicates
	    }

	    for (char ch : set) {
	        sb.append(ch);
	    }

	    System.out.println("After removing duplicates: " + sb);
	}
}
