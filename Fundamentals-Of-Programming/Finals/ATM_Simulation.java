import java.util.Scanner;

public class ATM_Simulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 500;
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Input amount to deposit: ");
                    int deposit = input.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit Complete. Your balance is: " + balance);
                    } else {
                        System.out.println("Invalid amount! Deposit must be positive.");
                    }
                    break;

                case 2: 
                    int withdraw;
                
                    while (true) {
                        System.out.print("Input amount to withdraw: ");
                        withdraw = input.nextInt();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdraw successful. Remaining balance: " + balance);
                            break; 
                        } else if (withdraw > balance) {
                            System.out.println("Insufficient Balance! Try a smaller amount.");
                        } else {
                            System.out.println("Invalid amount! Must be greater than zero.");
                        }
                    }
                    break;

                case 3: 
                    System.out.println("Your current Balance: " + balance);
                    break;

                case 0: 
                    System.out.println("Thank you for using the ATM! Goodbye.");
                    break;

                default: 
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        input.close();
    }
}