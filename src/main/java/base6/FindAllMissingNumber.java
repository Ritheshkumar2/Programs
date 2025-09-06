package base6;

import java.util.HashSet;
import java.util.Set;

public class FindAllMissingNumber {

	public static void main(String[] args) {
		test(new int[]{1,2,0,5,11});
	}
	
	private static void test(int[] nums) {
		Set<Integer> result=firstpostivemissingNumber(nums);
		
		System.out.print(result);
	}

	private static Set<Integer> firstpostivemissingNumber(int[] input) {
		
		
		Set<Integer> ss=new HashSet<>();
		
		int max=0;
		
		for(int num:input) {
			if(num > 0) {
				ss.add(num);
				max=Math.max(max, num);
			}
		}
		// Step 2: Collect missing numbers
        Set<Integer> missing = new HashSet<>();
        for (int i = 1; i <= max; i++) {
            if (!ss.contains(i)) {
                missing.add(i);
            }
        }

        return missing;
    }
}
