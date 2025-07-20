package base2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		test();
		test2();
		test3();

	}

	private static void test() {
		
		int[] arr= {1,1,2,2,3,2,3,1,4,5,6,7,8,9};
		
		Set<Integer> unq=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			unq.add(arr[i]);
		}
		//System.out.print(unq);
		
		for(int u:unq) {
			System.out.print(u+" ");
		}
		
		System.out.println("");
	}
	
	private static void test2() {
		String name="Rithesh";
		
		char[] ch=name.toCharArray();
		
		Set<Character> c=new HashSet<>();
		for(int i=0;i<ch.length;i++) {
			c.add(ch[i]);
		}
		System.out.print(c);
		System.out.println("");
	}
	
	public static void test3() {
		String name = "ritheshrithesh";
        char[] ch = name.toCharArray();
        Arrays.sort(ch);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            // Check if this is the first character or not same as previous
            if (i == 0 || ch[i] != ch[i - 1]) {
                result.append(ch[i]);
            }
        }

        System.out.println(result.toString()); // Output: ehrist
    	}
}
