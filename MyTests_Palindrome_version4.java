import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTests_Palindrome_version4 {

	@Test
	void test1() {
		assertEquals(true, Palindrome_version4.isPalindrome("Anna"));
	}
	@Test
	void test2() {
		assertEquals(true, Palindrome_version4.isPalindrome("A n na"));
	}
	@Test
	void test3() {
		assertEquals(false, Palindrome_version4.isPalindrome("Test"));
	}
	@Test
	void test4() {
		assertEquals(true, Palindrome_version4.isPalindrome("?An.n!a"));
	}
	@Test
	void test5() {
		assertEquals(true, Palindrome_version4.isPalindrome("Antna"));
		
	}


}
