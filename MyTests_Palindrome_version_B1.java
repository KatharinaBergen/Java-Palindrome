import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTests_Palindrome_version_B1 {

	@Test
	void testB1() {
		assertEquals(true, Palindrome_version_B1.isPalindrome("A"));
	}
	
	@Test
	void testB2() {
		assertEquals(true, Palindrome_version_B1.isPalindrome("AA"));
	}
	
	@Test
	void testB3() {
		assertEquals(false, Palindrome_version_B1.isPalindrome("AB"));
	}
	
	@Test
	void test1() {
		assertEquals(true, Palindrome_version_B1.isPalindrome("Anna"));
	}
	@Test
	void test2() {
		assertEquals(true, Palindrome_version_B1.isPalindrome("A n na"));
	}
	@Test
	void test3() {
		assertEquals(false, Palindrome_version_B1.isPalindrome("Test"));
	}
	@Test
	void test4() {
		assertEquals(true, Palindrome_version_B1.isPalindrome("?An.n!a"));
	}
	@Test
	void test5() {
		assertEquals(true, Palindrome_version_B1.isPalindrome("Antna"));
	}
}
