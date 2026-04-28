import java.util.Scanner;

public class WhileLoopActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctEmail = "LadyFufu@fontaine.cum";
        String correctPassword = "iloveladyfurinasomuch";

        boolean isAuthenticated = false;

        System.out.println("--- Welcome to the System ---");

        while (!isAuthenticated) {
            System.out.print("Enter Email: ");
            String inputEmail = input.nextLine();

            System.out.print("Enter Password: ");
            String inputPassword = input.nextLine();

            if (inputEmail.equals(correctEmail) && inputPassword.equals(correctPassword)) {
                System.out.println("\nAccess Granted! Welcome back.");
                isAuthenticated = true;
            } else {
                System.out.println("\nIncorrect credentials. Please try again.\n");
            }
        }

        input.close();
        System.out.println("Program finished.");
    }
}