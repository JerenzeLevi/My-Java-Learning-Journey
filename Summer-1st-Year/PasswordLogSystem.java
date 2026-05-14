import java.util.Scanner;

public class PasswordLogSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = null; // Initially no password registered
        int choice;

        do {
            // Display Main Menu
            System.out.println("\n---Main Menu---");
            System.out.println("[1] Register Password");
            System.out.println("[2] Log in");
            System.out.println("[3] Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    // Register password
                    System.out.print("Create a password: ");
                    password = scanner.nextLine();
                    System.out.println("Password registered successfully!");
                    break;

                case 2:
                    // Login
                    if (password == null) {
                        System.out.println("No password registered. Please register first.");
                        break;
                    }

                    String inputPassword;
                    do {
                        System.out.print("Enter your password: ");
                        inputPassword = scanner.nextLine();
                        if (!inputPassword.equals(password)) {
                            System.out.println("Incorrect Password. Please try again.");
                        }
                    } while (!inputPassword.equals(password));

                    System.out.println("Log in Successful!");
  
                    // Input five names
                    String[] names = new String[5];
                    System.out.println("Enter 5 names:");
                    for (int i = 0; i < names.length; i++) {
                        System.out.print("Name " + (i + 1) + ": ");
                        names[i] = scanner.nextLine();
                    }

A                    // Display names
                    System.out.println("\nYou entered:");
                    for (String name : names) {
                        System.out.println(name);
                    }
                    break;

                case 3:
                    // Exit
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }

        } while (choice != 3);

        scanner.close();
    }
}