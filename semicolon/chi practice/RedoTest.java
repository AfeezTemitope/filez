import java.util.Scanner;
public class RedoTest{
public static void main(String... args){
Scanner scanner = new Scanner (System.in);

System.out.println("prompt");
int userInput = scanner.nextInt();


String prompt = """
Press
1 -> ONE
2 -> TWO
3 -> THREE
4 -> FOUR
""";


String prompt1 = """
Press

1 -> English 
2 -> Yoruba 
""";

String prompt2 = """
Press 

1 -> Rap 
2 -> AfroBeat
""";

String prompt3 = """
Press

1 -> Beans 
2 -> Rice
""";

String prompt4 = """
Press

1 -> Chibuzo 
2 -> I'AM 
""";




switch (userInput){ 
case 1 -> 
        { System.out.println("ONE");
        System.out.print(prompt1);
}
case 2 -> {
System.out.println("TWO");
System.out.println(prompt2);
}
case 3 -> {
System.out.println("THREE");
System.out.println(prompt3);
}
case 4 -> {
System.out.println("FOUR");
System.out.println(prompt4);
}

default -> { System.out.print("what are you still waiting for exit abeg!!!");
}





}
}
}