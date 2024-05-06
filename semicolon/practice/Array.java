public class Array{
public static void main(String... args){

int age[] = {12, 4, 5, 2, 5};
int sum = 0;
double average;

for (int number: age){
sum += number;
}

int arrayLength = age.length;
average = (sum / arrayLength);

System.out.println("sum =" + sum);
System.out.println("average =" + average);
}
}
