public class CalculatorTest{
			

			public void testThatCalculatorCanAddTwoPositiveNumbers(){
				int sum = Calculator.add(2, 2); 
				int expectedSum = 4;

				if (sum !=expectedSum){
						System.err.printf("Test Failed\nExpected : %d\n Actual : %d", expectedSum, sum);

				}else{
						System.out.print("Test passed, yay  :) ");
				} 
			}

			public static void main(String... args){
				CalculatorTest calculatorTest = new CalculatorTest();
				calculatorTest.testThatCalculatorCanAddTwoPositiveNumbers();

			}

















}