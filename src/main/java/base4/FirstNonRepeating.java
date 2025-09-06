package base4;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		String value="lleettccooddef";
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(char c:value.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c:value.toCharArray()) {
			//System.out.print(c.getKey() + "-------"+c.getValue());
			if(map.get(c) == 1) {
				System.out.print(c);
				return;
			}
		}
		
	}

}
