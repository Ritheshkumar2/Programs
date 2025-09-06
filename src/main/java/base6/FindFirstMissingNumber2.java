package base6;

import java.util.HashSet;
import java.util.Set;

public class FindFirstMissingNumber2 {

	public static void main(String[] args) {
		test(new int[]{1,2,0,5});
	}
	
	private static void test(int[] nums) {
		int result=firstpostivemissingNumber(nums);
		
		System.out.print(result);
	}

	private static int firstpostivemissingNumber(int[] input) {
		
		
		Set<Integer> ss=new HashSet<>();
		for(int num:input) {
			if(num > 0) {
				ss.add(num);
			}
		}
		int smallest=1;
		while(true) {
			if(!ss.contains(smallest)) {
				return smallest;
			}
			smallest++;
		}
		
	}

}
