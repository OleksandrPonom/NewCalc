import org.example.SumCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SumCalculatorTest {
	private SumCalculator sumCalculator;
	@BeforeEach
	public void beforeEach() {
		sumCalculator = new SumCalculator();
	}
	@Test
	void testSumWithException() throws IllegalArgumentException{
		assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
	}
	@Test
	void testSumFirstNumber() {
		int absoluteResult = sumCalculator.sum(1);
		int expectedResult = 1;
		assertEquals(absoluteResult, expectedResult);
	}
	@Test
	void testSumSecondNumber() {
		int absoluteResult = sumCalculator.sum(3);
		int expectedResult = 6;
		assertEquals(absoluteResult, expectedResult);

	}
}