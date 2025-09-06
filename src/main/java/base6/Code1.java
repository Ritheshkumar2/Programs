package base6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Code1 {

	public static void main(String[] args) {
		test();

	}

	private static int test() {
		String input="swiss";
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(char c:input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Entry<Character, Integer> cc:map.entrySet()) {
			System.out.println(cc.getKey()+"-------"+cc.getValue());
			System.out.println(" ");	
		}
		 // Step 2: Find first non-repeating char in original order
        for (char c : input.toCharArray()) {
            if (map.get(c) == 1) {
            	System.out.println("First non-repeating character: " + c);
            	return c;
            }
        }
        return -1;
	}

}
