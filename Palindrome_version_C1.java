
public class Palindrome_version_C1 {

	public static void main(String[] args) {
		
		String word = args[0];
		
		System.out.println("The word is a palindrome: " + checkIfWordIsPalindrome(word));

	}

	//return lower case character
	private static char returnCharacter(String word, int i) {
		
	return word.toLowerCase().charAt(i);
		
	}
	
	//check if character is letter
	private static boolean isAlphapetical(String word, int i) {
		
		return Character.isLetter(returnCharacter(word, i));
		
	}
	
	//calculate index of last alphabetical character in word
	private static int findlastAlphabeticalIndex(String word) {
		
		int indexEnd = word.length() - 1;
		
		while(isAlphapetical(word, indexEnd) == false) indexEnd -= 1;
		
		return indexEnd;
	}
	
	//calculate index of next to last alphabetical character in word
	private static int findNextToLastAlphabeticalIndex(String word, int indexEnd) {
		
		indexEnd -= 1; 
		
		while(isAlphapetical(word, indexEnd) == false) indexEnd -= 1;
		
		return indexEnd;
	}
	
	//calculate index of next alphabetical character in word
		private static int findNextAlphabeticalIndex(String word, int indexStart) {
			
			while(isAlphapetical(word, indexStart) == false) indexStart += 1;
			
			return indexStart;
		}
	
	//compare characters to check if they are identical
	private static boolean compareIfCharactersAreEqual(String word, int indexStart, int indexEnd) {
		return (returnCharacter(word, indexStart) == returnCharacter(word, indexEnd)) ? true : false;
	}
	
	//iterate checking for each alphabetical character in word
	public static boolean checkIfWordIsPalindrome(String word) {
		
		boolean isPalindrome = true; 						//default boolean is true because one-letter-words are by default palindromes
		int indexEnd = findlastAlphabeticalIndex(word);		//finds index of last alphabetical character in word
		
		for (int indexStart = 0; indexStart < indexEnd; indexStart++) {
			indexStart = findNextAlphabeticalIndex(word, indexStart);
				
			isPalindrome = compareIfCharactersAreEqual(word, indexStart, indexEnd);
			if(isPalindrome == false) break;
			
			indexEnd = findNextToLastAlphabeticalIndex(word, indexEnd);
		}			
		return isPalindrome;		
	}

}
