import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Palindrome_version_C1Test {


	@Test
	void testB1() {
		assertEquals(true, Palindrome_version_C1.checkIfWordIsPalindrome("A"));
	}
	
	@Test
	void testB2() {
		assertEquals(true, Palindrome_version_C1.checkIfWordIsPalindrome("AA"));
	}
	
	@Test
	void testB3() {
		assertEquals(false, Palindrome_version_C1.checkIfWordIsPalindrome("AB"));
	}
	
	@Test
	void testC1() {
		assertEquals(false, Palindrome_version_C1.checkIfWordIsPalindrome("Tes??t??"));
	}
	
	@Test
	void testC2() {
		assertEquals(false, Palindrome_version_C1.checkIfWordIsPalindrome("T????? e    s??t??"));
	}
	
	@Test
	void testC3() {
		assertEquals(false, Palindrome_version_C1.checkIfWordIsPalindrome("AnnT"));
	}
	
	@Test
	void testC4() {
		assertEquals(true, Palindrome_version_C1.checkIfWordIsPalindrome("???Ann a"));
	}
	
	@Test
	void test1() {
		assertEquals(true, Palindrome_version_C1.checkIfWordIsPalindrome("Anna"));
	}
	@Test
	void test2() {
		assertEquals(true, Palindrome_version_C1.checkIfWordIsPalindrome("A n na"));
	}
	@Test
	void test3() {
		assertEquals(false, Palindrome_version_C1.checkIfWordIsPalindrome("Test"));
	}
	@Test
	void test4() {
		assertEquals(true, Palindrome_version_C1.checkIfWordIsPalindrome("?An.n!a"));
	}
	@Test
	void test5() {
		assertEquals(true, Palindrome_version_C1.checkIfWordIsPalindrome("Antna"));
	}

}
