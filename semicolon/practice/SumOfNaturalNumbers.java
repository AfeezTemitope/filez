import java.util.Scanner;

public class SumOfNaturalNumbers{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);

int[]numbers = new int[10];

System.out.println(" sum of ten(10) natural numbers: ");
for (int i = 0; i < 10; i++){
System.out.println(i + 1);
numbers[i] = i + 1;
}
int sum = 0;
for (int i = 0; i < 10; i++){
sum += numbers[i];

}
System.out.println("sum of 10 integers are: " + sum);

}
}

