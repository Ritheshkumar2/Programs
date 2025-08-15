package base4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintOddEvenNum {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		
		int[] arr= {1,2,3,4,5,6,7,8};
		
		List<Integer> arr1=new ArrayList<>();
		List<Integer> arr2=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2 == 0) {
				arr1.add(arr[i]);
			}else {
				arr2.add(arr[i]);
			}
			
		}
		System.out.print(arr1+""+arr2);
		System.out.println(" ");
		
		for(int even:arr1) {
			System.out.print(even+" ");
		}
		for(int odd:arr2) {
			System.out.print(odd+" ");
		}
		
//		Collections.sort(odd);
//		Collections.sort(even);
//		odd.addAll(even);
		
	}

}
