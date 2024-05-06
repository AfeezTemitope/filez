public class Calculator{


			public static int add (int firstNumber, int secondNumber){
			int sum = firstNumber + secondNumber;
			return sum;
			}

			public static int subtract (int firstNumber, int secondNumber){
			int difference = secondNumber - firstNumber;
			return difference;

			}

			public static int multiples (int firstNumber, int secondNumber){
			int totalNumber = 0;
			for ( int number = 0; number < secondNumber; number++){
			totalNumber += firstNumber;
}
			return totalNumber;
			}

}