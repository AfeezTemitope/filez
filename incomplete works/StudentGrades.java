import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        double[][] studentScores = new double[numOfStudents][numSubjects];
        double[] totalScores = new double[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter scores for student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                studentScores[i][j] = scanner.nextDouble();
            }

            // Calculate total score for each student
            for (double score : studentScores[i]) {
                totalScores[i] += score;
            }
        }

        // Sort students based on total scores (descending order)
        for (int i = 0; i < numOfStudents - 1; i++) {
            for (int j = 0; j < numOfStudents - 1 - i; j++) {
                if (totalScores[j] < totalScores[j + 1]) {
                    // Swap total scores
                    double temp = totalScores[j];
                    totalScores[j] = totalScores[j + 1];
                    totalScores[j + 1] = temp;

                    // Swap student scores
                    double[] tempScores = studentScores[j];
                    studentScores[j] = studentScores[j + 1];
                    studentScores[j + 1] = tempScores;
                }
            }
        }

        // Display student details with scores for each subject
        System.out.println("\nStudent Details:");
        System.out.println("+----------------------+--------+---------+-------+");
        System.out.printf("| %-20s | Total  | Average | Rank  |\n", "Name");
        System.out.println("+----------------------+--------+---------+-------+");

        for (int i = 0; i < numOfStudents; i++) {
            double averageScore = totalScores[i] / numSubjects;
            System.out.printf("| %-20s | %6.2f | %7.2f | %4d  |\n", "Student " + (i + 1), totalScores[i], averageScore, i + 1);
            System.out.println("+----------------------+--------+---------+-------+");
            System.out.println("| Subject Scores       |");
            System.out.println("+----------------------+");

            for (int j = 0; j < numSubjects; j++) {
                System.out.printf("| Subject %d: %6.2f |\n", j + 1, studentScores[i][j]);
            }

            System.out.println("+----------------------+");
        }

        System.out.println("+----------------------+--------+---------+-------+");
    }
}
