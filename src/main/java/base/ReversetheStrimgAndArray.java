package base;

import java.util.Scanner;

public class ReversetheStrimgAndArray {

	public static void main(String[] args) {
		reverseString();
		reverse2();
		reverse3();
		reverse4();

	}
	
	public static void reverseString() {
		
		String name="RitheshRithesh";
		
		char[] ch=name.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			
			System.out.print(ch[i]);
		}
		System.out.println(" ");
	}
	
	public static void reverse2() {
		String name = "RitheshRithesh";
	    for (int i = name.length() - 1; i >= 0; i--) {
	        System.out.print(name.charAt(i));
	    }
	    System.out.println(" ");
	}
	public static void reverse3() {
		String name = "RitheshRithesh";
	    String reversed = new StringBuilder(name).reverse().toString();
	    System.out.println(reversed);
	    System.out.println(" ");
	}
	
	public static void reverse4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Name: ");
		String name=sc.nextLine();
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println(" ");
		sc.close();
	}

}
