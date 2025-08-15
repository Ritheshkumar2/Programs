package base3;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		removeDuplicates();
		

	}
	
	
	private static void removeDuplicates() {
		
		int arr[]= {1,2,1,2,1,3,1,2,3,45,64,2,1,21,2};
		
		Set<Integer> sett=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			sett.add(arr[i]);
		}
		System.out.print(sett);
		System.out.println("");
		
		for(int s:sett) {
			System.out.print(s+" ");
		}
	}
}
