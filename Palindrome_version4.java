
public class Palindrome_version4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = args[0];
		
		boolean bool = isPalindrome(word);
		System.out.println(bool);	
	}

	public static boolean isPalindrome(String word) {
		
		//fromat word
		word = word.replaceAll("\\W", "").toLowerCase();
	
		//calculate max index
		int maxIndex = word.length() -1 ;
	
		//innitialize boolean
		boolean bool = false;
		
		//check for each letter if the letter on the opposite side of the word is identical
		for (int i = 0; i < maxIndex -1 ; i++) {
			if(word.charAt(i) == word.charAt(maxIndex - i)) {
				bool = true;
			}else {
				bool = false;
				break;
			}
		}
		return bool;
	}
	
}
	
			

