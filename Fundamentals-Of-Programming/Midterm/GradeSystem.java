import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a number (Grade): ");
        int grade = input.nextInt();

        if (grade > 100) {
            System.out.println("Result: Impossible");
        } 
        else if (grade >= 90) {
            System.out.println("Result: Outstanding");
        } 
        else if (grade >= 80) {
            System.out.println("Result: Good");
        } 
        else if (grade >= 75) {
            System.out.println("Result: Fair");
        } 
        else if (grade >= 0) {
            System.out.println("Result: Fail");
        } 
        else {
            System.out.println("Default: Invalid Input");
        }

        input.close();
    }
}
