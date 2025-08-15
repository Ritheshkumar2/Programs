package base4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FreqofString {

	public static void main(String[] args) {
		test();
		

	}

	private static void test() {
		
		String name="programming";
		
		Map<Character,Integer> object=new HashMap<>();
		
		
		for(Character c:name.toCharArray()) {
			object.put(c, object.getOrDefault(c, 0)+1);
		}
		
		for(Entry<Character, Integer> c:object.entrySet()) {
			System.out.println(c.getKey()+"---"+c.getValue());
		}
		System.out.println("");
		
	}
	
	

}
