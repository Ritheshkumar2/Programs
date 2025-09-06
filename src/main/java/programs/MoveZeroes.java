package programs;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		
		int[] arr = {0, 1, 0, 3, 12};
	    List<Integer> oo = new ArrayList<>();

	    // Add non-zero elements
	    for (int num : arr) {
	        if (num != 0) {
	            oo.add(num);
	        }
	    }

	    // Count zeros
	    int zeroCount = arr.length - oo.size();

	    // Add zeros at the end
	    for (int i = 0; i < zeroCount; i++) {
	        oo.add(0);
	    }

	    System.out.print(oo);
	}

}
