import static org.junit.Assert.*;
import org.junit.Test;

public class MathUtilsTest {
	@Test
	public void testPositive() {
		int kezdo = 4;
		int eredmeny = 5;
		int result = MathUtils.Increment(kezdo);
		assertTrue("4 bol 5 lett", result == eredmeny);
	}
	
	@Test
	public void testNegative() {
		assertTrue("uzenet", MathUtils.Increment(-2) == -1);
	}
	
	@Test
	public void testZero() {
		assertTrue(MathUtils.Increment(0) == 1);
	}
	
	@Test
	public void testIntMax() {
		assertTrue(MathUtils.Increment(Integer.MAX_VALUE) == Integer.MAX_VALUE);
	}
}
