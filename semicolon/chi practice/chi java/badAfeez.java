public class BadAfeez{

    public static void main(String... a){
        int numberA = 23;
        int numberB = 22;
        addNumber(numberA,numberB);

        int[] numbers = {1, 2, 3, 4, 5};
        findMinimum(numbers);
	Triangle(5);
    }

    public static void addNumber( int a, int b){
        int result = a + b;
        System.out.println(result);
    }

    public static void findMinimum( int [] numbers){
        int min = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("The minimum value is: " + min);
    }

    public static void printStar(){
	System.out.print("*  ");
    }
    public static void printSpace(){
	System.out.print(" ");
}

   public static void Triangle(int numbers){
	for ( int i = 0; i < numbers.length; i++){
	 printStar();
}
}

}
