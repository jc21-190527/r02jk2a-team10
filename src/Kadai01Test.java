import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai01Test {

	@Test
	void testReverseString() {
		Kadai01 k = new Kadai01();
		assertEquals("abcd",k.ReverseString("dcba"));
		assertEquals("a",k.ReverseString("a"));
		assertEquals(" ",k.ReverseString(" "));
		assertNotNull(k.ReverseString("123"));
	}

}
