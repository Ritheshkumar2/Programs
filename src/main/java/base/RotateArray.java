package base;

public class RotateArray {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		int[] arr= {1,2,3,4,5,6};
		
		int rotateNumber=3;
		
		for(int i=rotateNumber-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}
		
		
		
	}

}
