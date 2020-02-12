import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MyTests {
	
	@Test
	void test1() {
		assertEquals(true, Palindrome_version_2_cleaner.wrapperMethod("Anna"));
	}
	@Test
	void test2() {
		assertEquals(true, Palindrome_version_2_cleaner.wrapperMethod("A n na"));
	}
	@Test
	void test3() {
		assertEquals(false, Palindrome_version_2_cleaner.wrapperMethod("Test"));
	}
	@Test
	void test4() {
		assertEquals(true, Palindrome_version_2_cleaner.wrapperMethod("?An.n!a"));
	}
	@Test
	void test5() {
		assertEquals(true, Palindrome_version_2_cleaner.wrapperMethod("Antna"));
		
	}

}





