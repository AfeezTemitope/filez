import java.util.Scanner;
import java.util.Arrays;

public class BadBoySchool {
    private static int studentCount;
    private static int subjectCount;

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Students Do You Have? ");
        studentCount = input.nextInt();

        System.out.print("How Many Subjects do they offer? ");
        subjectCount = input.nextInt();

        int[][] score = new int[studentCount][subjectCount];
        double[] average = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println("Entering scores for student " + (i + 1) + ":");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("Enter subject score " + (j + 1) + ": ");
                score[i][j] = input.nextInt();
            }
        }

        printHeader();
        printScores(score);
    }

    public static void printHeader() {
        System.out.println("==========================================================");
        System.out.print("STUDENT\t\t");
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("SUB" + (i + 1) + "\t");
        }
        System.out.println("TOT\tAVE\tPOS");
        System.out.println("==========================================================");
    }

    public static void printScores(int[][] score) {
        int[] totalScores = new int[studentCount];
        for (int i = 0; i < studentCount; i++) {
            int total = 0;
            for (int j = 0; j < subjectCount; j++) {
                total += score[i][j];
            }
            totalScores[i] = total;
        }


        Arrays.sort(totalScores);
        for (int i = 0; i < studentCount; i++) {
           int total = totalScores[studentCount - 1 - i];
            double avg = (double) total / subjectCount;

            }
            System.out.printf("%d\t%.2f\t%d%n", total, avg, position);
        }
    }
}