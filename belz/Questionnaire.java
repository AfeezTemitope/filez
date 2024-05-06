import java.util.Scanner;

public class Questionnaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "1. A. how B. why",
            "2. A. what B. business",
            "3. A. food B. eat",
            "4. A. lap B. chi",
            "5. A. phone B. list"
        };
        int[] counts = new int[questions.length * 2]; // Two options per question

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String answer = scanner.nextLine().trim().toLowerCase();

            
            if (answer.equals("a")) {
                counts[i * 2]++;
            } else if (answer.equals("b")) {
                counts[i * 2 + 1]++;
            } else {
                System.out.println("Invalid answer. Please respond with 'A' or 'B'.");
             
            }
        }

     
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + " A count: " + counts[i * 2]);
            System.out.println("Question " + (i + 1) + " B count: " + counts[i * 2 + 1]);
        }

        scanner.close();
    }
}