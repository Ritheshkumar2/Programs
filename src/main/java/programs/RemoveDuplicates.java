package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveDuplicates obj=new RemoveDuplicates();
		
		obj.testone();	
	

	}
	public void testone() {
		String name="RRRRRitheshhhhhhhheeeeeeerrrrrrrrrr";
		
		Set<Character> object=new LinkedHashSet<>();
		
		for(char ch:name.toCharArray()) {
			object.add(ch);
		}
		
		StringBuilder obj=new StringBuilder();
		
		for(char c:object) {
			obj.append(c);
		}
		System.out.print(obj);
	}

}
