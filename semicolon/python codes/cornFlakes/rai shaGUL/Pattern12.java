public class InitArray {
public static void main(String...args){

int[] array = new int[ARRAY_LENGTH];
final int ARRAY_LENGTH = 10;

for (int counter = 0; counter < array.length; counter++){
   array[counter] = 2 + 2 * counter;
}

System.out.printf("%s%8s%n", "index", "value");

for (int counter = 0; counter < array.length; counter++){
    System.out.printf("%5d%8d%n", counter, array[counter]);
}
}
}