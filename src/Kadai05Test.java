import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai05Test {

	@Test
	void test() {
		Kadai05 k = new Kadai05();
		int[] test = {1,5,6,9};
		assertEquals(9,k.getMax(test));
		int[] test2 = {1,1,1,1};
		assertEquals(1,k.getMax(test2));
	}

}
