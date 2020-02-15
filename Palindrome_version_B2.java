
public class Palindrome_version_B2 {

	public static void main(String[] args) {
		
				String word = args[0];
				
				System.out.println(isPalindrome(word));
		
			}
	
			//1 format word
			private static String format(String word) {
				
				return word.replaceAll("\\W", "").toLowerCase();
				
			}
	
			//2 Single characters are by default palindromes.
			private static boolean defaultPalindrome(String word) {
				
				return (word.length() == 1) ? true : false;
				
			}
			
			//3 check for each letter if the letter on the opposite side of the word is identical
			private static boolean checkLetters(String word) {
				
				boolean bool = false;
				
				for (int i = 0; i < word.length() / 2 ; i++) {
					bool = (word.charAt(i) == word.charAt(word.length() -1 - i)) ? true : false;
					if(bool == false) break;
				}
				
				return bool;
				
			}
			
			//4 wrapper function
			public static String isPalindrome(String word) {

				String formattedWord = format(word);
				boolean bool = defaultPalindrome(formattedWord);
				
				if (bool == false) bool = checkLetters(formattedWord);
				
				return bool ? "The word is a Palindrome" : "The word is not a Palindrome";
				
			}

}
			


