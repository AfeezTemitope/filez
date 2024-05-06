import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{
			
			@Test
			public void testThatCalculatorCanAddTwoPositiveNumbers(){
				int sum = Calculator.add(2, 2); 
				int expectedSum = 4;
				assertEquals(expectedSum, sum);


			}
			@Test
			public void testThatCalculatorCanSubtract(){
			int difference = Calculator.subtract(2,4);
			int expectedResult = 2;
			assertEquals(expectedResult, difference);

			}

			@Test
			public void testThatCalculatorCanAddNegativeNumber(){
			int negativeNumber = Calculator.add(-2,-4);
			int expectedResult = -6;
			assertEquals(expectedResult, negativeNumber);
	


			}
			@Test
			public void testThatCalculatorCanMultiply(){
			int multipless = Calculator.multiples(5,5);
			int expectedResult = 2;
			assertEquals(expectedResult, multipless);

			
			}


}

