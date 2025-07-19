package base;

public class ReverseTheValues {
	
	public static void main(String[] args) {
		test();
		test2();
	}

	public static void test() {
		int[] arr= {1,2,3,4,5,6,7,8};
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println(" ");
	}
	
	public static void test2() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
	    int start = 0;
	    int end = arr.length - 1;
	    
	    while (start < end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }

	    // Now print reversed array
	    for (int num : arr) {
	        System.out.print(num + " ");
	    }
	    System.out.println();
	}
}
