import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestingTest {

	JunitTesting jt = new JunitTesting();

	@Test
	public void test() {
		int sqr = jt.square(4);

		assertEquals(sqr, 16);
	}

	@Test
	public void countATest() {
		int cnt = jt.countA("Kiran");
		assertEquals(cnt, 1);

	}
}
