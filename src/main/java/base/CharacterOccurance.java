package base;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		
		String name="RitheshRithesh";
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(Character c:name.toCharArray()) {
			map.put(c, map.getOrDefault(c,0) + 1);
		}
		
		for(Map.Entry<Character,Integer> cc:map.entrySet()) {
            System.out.println(cc.getKey() + " = " + cc.getValue());

		}
		
	}

}
