package base;

public class FindLargestAndSmallNumber {

	public static void main(String[] args) {
		findlargeNum();
		smallNum();
			

	}

	private static void findlargeNum() {
		int[] arr= {1,2,3,1121,121,12111,213,0,4,12};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max=arr[i];
			}	
		}
		System.out.print(max);
		System.out.println("");
	}
	
	private static void smallNum() {
        int[] arr= {1,2,3,1121,121,12111,213,0,4,12};
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min=arr[i];
			}	
		}
		System.out.print(min);
	}

}
