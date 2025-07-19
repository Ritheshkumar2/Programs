package base;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		test();
		test2();

	}

	private static void test() {
		
		int[] arr= {1,2,3,4,4,2,1,21,31,1,2,7};
		
		Set<Integer> unq=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			unq.add(arr[i]);
		}
		
		for(int c:unq) {
			System.out.print(c+" ");
		}
		System.out.println(" ");
	}
	
	public static void test2() {
		int[] arr= {1,2,3,4,4,2,1,21,31,1,2,7};
		Set<Integer> unq=new HashSet<>();
		for (int num : arr) {
		    unq.add(num);
		}
	
		//Integer[] uninum=unq.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arr)+"original ");
		//System.out.println(Arrays.toString(uninum)+" duplicate");
		System.out.println(unq+"duplicate ");
	}

}
