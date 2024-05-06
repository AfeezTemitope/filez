import java.util.Scanner;

public class Seven{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] segments = {
            "abcdef", 
            "bc",     
            "abdeg",  
            "abcdg",  
            "bcfg",   
            "acdfg",  
            "acdefg", 
            "abc",    
            "abcdefg",
            "abcdfg"  
        };

      
        System.out.print("Enter a digit (0-9): ");
        int digit = scanner.nextInt();

     
        if (digit >= 0 && digit <= 9) {
            String segmentsOn = segments[digit];
            displaySegments(segmentsOn);
        } else {
            System.out.println("Invalid input. Please enter a digit between 0 and 9.");
        }
    }

   
    public static void displaySegments(String segmentsOn) {
        String[] display = {
            "  a  ",
            "f   b",
            "  g  ",
            "e   c",
            "  d  "
        };

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < segmentsOn.length(); j++) {
                char segment = segmentsOn.charAt(j);
                System.out.print(display[i].replace(segment, segment == ' ' ? ' ' : '#'));
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}