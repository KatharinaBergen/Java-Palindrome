
public class Palindrome_version_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word = args[0];
		
		//STEP 0: schange to lower case
		System.out.println(word);
		
		word = word.toLowerCase();		
		
		System.out.println("STEP 0 DONE");
		
		
		//STEP 1: Remove non-letter characters from word
		System.out.println(word);
		
		for(int i = 0; i < word.length(); i++) {
			
			//letter to be checked
			char letter = word.charAt(i);

			//if letter is not in the alphabet remove it
			if(Character.isLetter(letter) == false) {
				word = word.replace(Character.toString(letter), "");
			}	
		}
		
		System.out.println("STEP 1 DONE");
		
		
		//STEP 2: If word length is odd, pop middle character
		System.out.println(word);
		
		if((word.length() % 2) == 1 ) {
			
			//index of middle character
			int ix = (word.length() / 2);
			
			//remove middle character
			char characterToRemove = word.charAt(ix);
			word = word.replace(Character.toString(characterToRemove), "");
		}
		
		System.out.println("STEP 2 DONE");
		
		
		//STEP 3: Check if word is a palindrome
		System.out.println(word);
		
		for(int i = 0; i < word.length(); i++) {
			
			int startIndex = word.length() / 2 - 1;
			int endIndex = word.length() / 2 + 1;
			
			String sub = word.substring(startIndex, endIndex);
			
			if(sub.charAt(0) == sub.charAt(1)) {
				word = word.replace(Character.toString(sub.charAt(0)), "");
				word = word.replace(Character.toString(sub.charAt(1)), "");
			} 
			else {
				System.out.println("The word is not a palindrome.");
				break;
			}
		}
		
		//LAST STEP: double check length of the word is 0. If so, the word is a palindrome.
		if(word.length() == 0) {
			System.out.println("The word is a palindrome.");
		}
	}
}
	  