import java.util.Scanner;

public class LuckyNumbers {
public static void main(String... args) {
Scanner input = new Scanner(System.in);

        
int counter = 0; 
int i = (int)(Math.random() * 100);

System.out.println("**********************************");
System.out.println("WELCOME TO THE GUESSING GAME");
System.out.println("**********************************");

boolean guessedRight = false;

            while (!guessedRight) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            counter++;

            if (number == i) {
                System.out.println("You are correct!");
                    guessedRight = true;
            } else if (number < i) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
} 

                if (!guessedRight && counter >= 3) {
                System.out.println("Motherfucking bastard u entered 3 incorrect guesses i'm generating a new ones!!!");
                i = (int) (Math.random() * 100);
                counter = 0;           
}
}  
}
}