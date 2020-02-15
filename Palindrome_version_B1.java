
public class Palindrome_version_B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = args[0];
		
		boolean bool = isPalindrome(word);
		System.out.println(bool);	
		
		//print out for user if word is Palindrome or not
		if(bool == true) {
			System.out.println("The word is a Palindrome");
		} else {
			System.out.println("The word is not a Palindrome");
		}
	}
	
	public static boolean prepareIsPalindrome(String word) {
		
		//fromat word
		word = word.replaceAll("\\W", "").toLowerCase();
			
		//innitialize boolean
		boolean bool = false;
			
		//check for each letter if the letter on the opposite side of the word is identical
		for (int i = 0; i < word.length() / 2 ; i++) {
			if(word.charAt(i) == word.charAt(word.length() -1 - i)) {
				bool = true;
			}else {
				bool = false;
				break;
			}
		}
		return bool;
	}
	
	public static boolean isPalindrome(String word) {
		//Single characters are by default palindromes.
		
		//call boolean from previous method. 
		boolean bool = prepareIsPalindrome(word);
		
		//If bool is false check if length of word equals 1 character. If so, the word is a palindrome and the bool must be set to true.
		if(bool == false && word.length() == 1) {
			bool = true;
		}	
		return bool;
	}
		
}


