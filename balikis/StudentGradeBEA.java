
import java.util.Scanner;
import java.util.Arrays;

public class StudentGradeBEA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = input.nextInt();

        int[][] grades = new int[numStudents][numSubjects];
        int[] totalScores = new int[numStudents]; 

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grades for student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                grades[i][j] = input.nextInt();
                totalScores[i] += grades[i][j]; 
            }
        }

      
        double[] averages = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {
            averages[i] = (double) totalScores[i] / numSubjects;
        }

     
        int[] sortedScores = totalScores.clone();
        Arrays.sort(sortedScores);
        for (int i = 0; i < sortedScores.length / 2; i++) {
            int temp = sortedScores[i];
            sortedScores[i] = sortedScores[sortedScores.length - 1 - i];
            sortedScores[sortedScores.length - 1 - i] = temp;
        }

        // Print the header
        printHeader(numSubjects);

        // Print student details and position
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + (i + 1) + "\t");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            double average = averages[i];
            int position = getPosition(sortedScores, totalScores[i]);
            System.out.printf("%d\t%.2f\t%d\n", totalScores[i], average, position);
        }
        printBase();
    }

    public static void printHeader(int numSubjects) {
        printBase();
        System.out.print("STUDENT\t\t");
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("SUB" + i + "\t");
        }
        System.out.println("TOT\tAVE\tPOS");
        printBase();
    }

    public static int getPosition(int[] sortedScores, int totalScore) {
        for (int i = 0; i < sortedScores.length; i++) {
            if (sortedScores[i] == totalScore) {
                return i + 1;
            }
        }
        return -1; 
    }

    public static void printBase() {
        System.out.print("==============================================================================\n");
    }
}


   
    

