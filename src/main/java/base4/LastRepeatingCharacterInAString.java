package base4;

import java.util.HashMap;
import java.util.Map;

public class LastRepeatingCharacterInAString {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		String name="leetcoddffgg";
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(char c:name.toCharArray()) {
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		for(int i=name.length()-1;i>0;i--) {
			char c=name.charAt(i);
			
			if(map.get(c) > 1) {
				System.out.print(c);
				return;
			}
		}
		
		
	}

}
