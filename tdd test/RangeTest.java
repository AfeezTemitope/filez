import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeTest {

		@Test
		public void testThatTheFunctionWorksForRange() {
		int[] numbers = {7, 4, 2, 3, 4};
		int rangeOfNumber = RangeOfANumber.range(numbers);
		int expectedResult = 5;
		assertEquals(expectedResult, rangeOfNumber);
    		}
}
