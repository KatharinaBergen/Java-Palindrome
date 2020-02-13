import java.util.Scanner;

public class Palindrome_version2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = args[0];
		
		wrapperMethod(word);
		
	}
	
	//METHODS
	
	//Wrapper Step
	public static boolean wrapperMethod(String word) {
		
		//Step 0
		word = word.toLowerCase();	
				
		//Step 1
		word = removeNonLetters(word);
				
		//Step 2
		word = middleCharacter(word);
				
		//Step 3
		word = checkIfPalindrome(word);
				
		//STEP 4
		boolean bool = checkWordLength(word);
		
		//LAST STEP: wrap steps and return result
		if(bool == true) {
			System.out.println("The word is a palindrome.");
		}else {
			System.out.println("The word is not a palindrome.");
		}
		return bool;
	}
	

	
	//STEP 1: Remove non-letter characters from word
	public static String removeNonLetters(String word) {
		
		for(int i = 0; i < word.length(); i++) {
			
			//letter to be checked
			char letter = word.charAt(i);

			//if letter is not in the alphabet remove it
			if(Character.isLetter(letter) == false) {
				word = word.replace(Character.toString(letter), "");
			}
		}
		
		return word;
	}
	
	
	//STEP 2: If word length is odd, pop middle character
	public static String middleCharacter(String word) {
			
		if((word.length() % 2) == 1 ) {
				
			//index of middle character
			int ix = (word.length() / 2);
				
			//remove middle character
			char characterToRemove = word.charAt(ix);
			word = word.replace(Character.toString(characterToRemove), "");
			}
		
		return word;
	}
	

	//STEP 3: Check if word is a palindrome
	public static String checkIfPalindrome(String word) {
			
			for(int i = 0; i < word.length(); i++) {
				
				int startIndex = word.length() / 2 - 1;
				int endIndex = word.length() / 2 + 1;
				
				String sub = word.substring(startIndex, endIndex);
				
				if(sub.charAt(0) == sub.charAt(1)) {
					word = word.replace(Character.toString(sub.charAt(0)), "");
					word = word.replace(Character.toString(sub.charAt(1)), "");
				} 
				else {
					break;
				}
			}
			
			return word;
	}
	
	
	//STEP 4: double check length of the word is 0. If so, the word is a palindrome.
			
	public static boolean checkWordLength(String word) {
		if(word.length() == 0) {
			return true;
		}
		else { 
			return false;
		}
	}
	

}
