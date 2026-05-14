import java.util.Scanner;

public class StudentGradeManagementSystem {

    // Method to calculate average
    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName;
        int[] grades = new int[5];

        // Step 1: Input Student Name
        System.out.print("Enter student name: ");
        studentName = scanner.nextLine();

        // Step 2: Input grades for five subjects with validation
        for (int i = 0; i < grades.length; i++) {
            while (true) {
                System.out.print("Enter grade for subject " + (i + 1) + ": ");
                int inputGrade = scanner.nextInt();

                if (inputGrade >= 0 && inputGrade <= 100) {
                    grades[i] = inputGrade;
                    break;
                } else {
                    System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                }
            }
        }

        // Step 3: Calculate average
        double average = calculateAverage(grades);

        // Step 4: Output
        System.out.println("\nGrades for " + studentName + ":");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + grades[i]);
        }

        System.out.printf("\nAverage Grade: %.1f\n", average);

        scanner.close();
    }
}