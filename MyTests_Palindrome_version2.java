import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MyTests_Palindrome_version2 {
	
	@Test
	void test1() {
		assertEquals(true, Palindrome_version2.wrapperMethod("Anna"));
	}
	@Test
	void test2() {
		assertEquals(true, Palindrome_version2.wrapperMethod("A n na"));
	}
	@Test
	void test3() {
		assertEquals(false, Palindrome_version2.wrapperMethod("Test"));
	}
	@Test
	void test4() {
		assertEquals(true, Palindrome_version2.wrapperMethod("?An.n!a"));
	}
	@Test
	void test5() {
		assertEquals(true, Palindrome_version2.wrapperMethod("Antna"));
		
	}

}





