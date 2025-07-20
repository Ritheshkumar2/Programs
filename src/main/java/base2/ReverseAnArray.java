package base2;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		//test(arr,0,arr.length-1);
		//test(arr,0,arr.length-1);
		//test(arr,0,arr.length-1);
		
		int k = 3;

        int n = arr.length;
        k = k % n; 
		// Step 1: Reverse entire array
        test(arr, 0, n - 1);      // {6, 5, 4, 3, 2, 1}

        // Step 2: Reverse first k elements
        test(arr, 0, k - 1);      // {4, 5, 6, 3, 2, 1}

        // Step 3: Reverse remaining elements
        test(arr, k, n - 1);      // {4, 5, 6, 1, 2, 3}
		
		

	}
	
	
	private static void test(int[] arr, int start,int end) {
		//reverse an element without additional array
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		
		System.out.print(Arrays.toString(arr));
		
		
		
	}

}
