public class CalculatorTest{

	public void testThatCalculatorCanAddTwoPositiveNumber(){
		
		
		int result = Calculator.add(7,50); 
		int expectedResult = 57;
		

		String sum = (result != expectedResult )? "Test Failed\n " + expectedResult : "YaY Tested pass\n" + "EXPECTED :"+ expectedResult ; 
		System.out.print(sum);

	}
	public static void main(String... args){
		CalculatorTest calculatorTest = new CalculatorTest();

		CalculatorTest.testThatCalculatorCanAddTwoPositiveNumber();

	}





	
} 