import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTests_Palindrome_version3 {

	@Test
	void test1() {
		assertEquals(true, Palindrome_version3.isPalindrome("Anna"));
	}
	@Test
	void test2() {
		assertEquals(true, Palindrome_version3.isPalindrome("A n na"));
	}
	@Test
	void test3() {
		assertEquals(false, Palindrome_version3.isPalindrome("Test"));
	}
	@Test
	void test4() {
		assertEquals(true, Palindrome_version3.isPalindrome("?An.n!a"));
	}
	@Test
	void test5() {
		assertEquals(true, Palindrome_version3.isPalindrome("Antna"));
		
	}


}
