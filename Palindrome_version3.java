import java.text.Format;

public class Palindrome_version3 {

	public static void main(String[] args) {
		

		// pass argument to variable
		String word = args[0];
		
		//use isPalindrome method to check if word is Palindrome
		boolean bool = isPalindrome(word);
		
		//print out for user if word is Palindrome or not
		if(bool == true) {
			System.out.println("The word is a Palindrome");
		} else {
			System.out.println("The word is not a Palindrome");
		}
		
	}
	
	public static boolean isPalindrome(String word) {
		
		//create helper object to reverse word
		StringBuilder helper = new StringBuilder();
		helper.append(word);
		helper = helper.reverse();
		
		//pass helper object to String
		String wordReversed = helper.toString();
		
		//check if original and reversed word are identical 
		//while ignoring upper/lower casing 
		//and ignoring/replacing non-alphabetical characters
		boolean bool = word.replaceAll("\\W", "").equalsIgnoreCase(
				wordReversed.replaceAll("\\W", ""));
		
		return bool;
	}
	

}
