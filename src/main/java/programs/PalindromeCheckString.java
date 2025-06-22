package programs;

public class PalindromeCheckString {
	
	public static void main(String[] args) {
		PalindromeCheckString object=new PalindromeCheckString();
		object.stringReverseProgram();
		object.checkPalindrome();
		object.checkPalindromeInDifferentWay();
	}
	
	public void stringReverseProgram() {
		
		String name="Rithesh";
		int stringLength=name.length();
		
		for(int i=stringLength-1;i>=0;i--) {
			char ch=name.charAt(i);
			System.out.print(ch);
		}
		System.out.println(" ");
		
	}
	
	public void checkPalindrome() {
		String name="MOM";
		String input="MOM";
		
		StringBuilder nameMod=new StringBuilder();
		nameMod.append(name);
		nameMod.reverse();
		System.out.println(nameMod);
		
		if(input.equals(name.toString())) {
			System.out.println("Palindrome");
		}else {
		System.out.println("Not a Palindrome");
		}
		System.out.println(" ");

	}
	
	public void checkPalindromeInDifferentWay() {
		String name="MADAMMad";
		
		boolean IsPalindorme=true;
		
		//But you only need to go halfway. After halfway, you're just rechecking the same characters from the other side.
		for(int i=0;i<name.length()/2;i++) {
			//The extra -1 is because string indexing starts from 0.
			if(name.charAt(i)!=name.charAt(name.length()-i-1)) {
				IsPalindorme=false;
				break;
			}
		}
		if (IsPalindorme) {
	        System.out.println("Palindrome");
	    } else {
	        System.out.println("Not a Palindrome");
	    }
	}

}
