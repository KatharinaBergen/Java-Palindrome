import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTests_Palindrome_version_B2 {

	@Test
	void testB1() {
		assertEquals("The word is a Palindrome", Palindrome_version_B2.isPalindrome("A"));
	}
	
	@Test
	void testB2() {
		assertEquals("The word is a Palindrome", Palindrome_version_B2.isPalindrome("AA"));
	}
	
	@Test
	void testB3() {
		assertEquals("The word is not a Palindrome", Palindrome_version_B2.isPalindrome("AB"));
	}
	
	@Test
	void test1() {
		assertEquals("The word is a Palindrome", Palindrome_version_B2.isPalindrome("Anna"));
	}
	@Test
	void test2() {
		assertEquals("The word is a Palindrome", Palindrome_version_B2.isPalindrome("A n na"));
	}
	@Test
	void test3() {
		assertEquals("The word is not a Palindrome", Palindrome_version_B2.isPalindrome("Test"));
	}
	@Test
	void test4() {
		assertEquals("The word is a Palindrome", Palindrome_version_B2.isPalindrome("?An.n!a"));
	}
	@Test
	void test5() {
		assertEquals("The word is a Palindrome", Palindrome_version_B2.isPalindrome("Antna"));
	}

}
