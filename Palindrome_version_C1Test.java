import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Palindrome_version_C1Test {


	@Test
	void testB1() {
		assertEquals(true, Palindrome_version_C1.isPalindrome("A"));
	}
	
	@Test
	void testB2() {
		assertEquals(true, Palindrome_version_C1.isPalindrome("AA"));
	}
	
	@Test
	void testB3() {
		assertEquals(false, Palindrome_version_C1.isPalindrome("AB"));
	}
	
	@Test
	void testC1() {
		assertEquals(false, Palindrome_version_C1.isPalindrome("Tes??t??"));
	}
	
	@Test
	void testC2() {
		assertEquals(false, Palindrome_version_C1.isPalindrome("T????? e    s??t??"));
	}
	
	@Test
	void testC3() {
		assertEquals(false, Palindrome_version_C1.isPalindrome("AnnT"));
	}
	
	@Test
	void testC4() {
		assertEquals(true, Palindrome_version_C1.isPalindrome("???Ann a"));
	}
	
	
	@Test
	void test1() {
		assertEquals(true, Palindrome_version_C1.isPalindrome("Anna"));
	}
	@Test
	void test2() {
		assertEquals(true, Palindrome_version_C1.isPalindrome("A n na"));
	}
	@Test
	void test3() {
		assertEquals(false, Palindrome_version_C1.isPalindrome("Test"));
	}
	@Test
	void test4() {
		assertEquals(true, Palindrome_version_C1.isPalindrome("?An.n!a"));
	}
	@Test
	void test5() {
		assertEquals(true, Palindrome_version_C1.isPalindrome("Antna"));
	}

}
