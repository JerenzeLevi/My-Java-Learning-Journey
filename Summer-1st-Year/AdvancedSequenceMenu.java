import java.util.Scanner;

public class AdvancedSequenceMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int modeChoice;

        while (true) {
          
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Non-linear Sequence");
            System.out.println("2. Alternative Pattern");
            System.out.println("3. Multiple and Additive");
            System.out.println("4. Fraction and Exponential");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            modeChoice = scanner.nextInt();

            if (modeChoice == 5) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            if (modeChoice < 1 || modeChoice > 5) {
                System.out.println("Invalid input. Input (1-5) only. Try again.");
                continue;
            }

            int formulaChoice = 0;
            System.out.println("SELECTED: " + getModeName(modeChoice));
            switch (modeChoice) {
                case 1:
                    System.out.println("Choose a formula:");
                    System.out.println("1. a_n = n^2 + 1");
                    System.out.println("2. a_n = n^2 + n");
                    System.out.println("3. a_n = n^2 - n");
                    break;
                case 2:
                    System.out.println("Choose a formula:");
                    System.out.println("1. Odd: n, Even: n*2");
                    System.out.println("2. Odd: n^2, Even: n+5");
                    System.out.println("3. Odd: 2n, Even: n^2");
                    break;
                case 3:
                    System.out.println("Choose a formula:");
                    System.out.println("1. a_n = a_(n-1) * 2 + 1 (start = INPUT NO)");
                    System.out.println("2. a_n = a_(n-1) * 3 - 2 (start = INPUT NO)");
                    System.out.println("3. a_n = a_(n-1) + (2n) (start = INPUT NO)");
                    break;
                case 4:
                    System.out.println("Choose a formula:");
                    System.out.println("1. a_n = (1/2)^(n-1)");
                    System.out.println("2. a_n = 1 / n!");
                    System.out.println("3. a_n = (1/3)^n");
                    break;
            }

            System.out.print("Enter formula choice (1-3): ");
            formulaChoice = scanner.nextInt();

            if (formulaChoice < 1 || formulaChoice > 3) {
                System.out.println("Invalid formula. Try again.");
                continue;
            }

        
            System.out.print("INPUT NO.: ");
            int inputNo = scanner.nextInt();

            System.out.print("INPUT SEQUENCE LENGTH: ");
            int length = scanner.nextInt();

            System.out.println("OUTPUT:");

            
            switch (modeChoice) {
                case 1:
                    for (int i = inputNo; i < inputNo + length; i++) {
                        int result = 0;
                        switch (formulaChoice) {
                            case 1: result = i * i + 1; break;
                            case 2: result = i * i + i; break;
                            case 3: result = i * i - i; break;
                        }
                        System.out.print(result + (i != inputNo + length - 1 ? ", " : ""));
                    }
                    break;

                case 2:
                    for (int i = inputNo; i < inputNo + length; i++) {
                        int result = 0;
                        switch (formulaChoice) {
                            case 1:
                                result = (i % 2 == 1) ? i : i * 2;
                                break;
                            case 2:
                                result = (i % 2 == 1) ? i * i : i + 5;
                                break;
                            case 3:
                                result = (i % 2 == 1) ? 2 * i : i * i;
                                break;
                        }
                        System.out.print(result + (i != inputNo + length - 1 ? ", " : ""));
                    }
                    break;

                case 3:
                    int term = inputNo;
                    for (int i = 0; i < length; i++) {
                        System.out.print(term + (i != length - 1 ? ", " : ""));
                        switch (formulaChoice) {
                            case 1:
                                term = term * 2 + 1;
                                break;
                            case 2:
                                term = term * 3 - 2;
                                break;
                            case 3:
                                term = term + (2 * (inputNo + i));
                                break;
                        }
                    }
                    break;

                case 4:
                    for (int i = inputNo; i < inputNo + length; i++) {
                        double result = 0;
                        switch (formulaChoice) {
                            case 1:
                                result = Math.pow(0.5, i - 1);
                                break;
                            case 2:
                                result = 1.0 / factorial(i);
                                break;
                            case 3:
                                result = Math.pow(1.0 / 3, i);
                                break;
                        }
                        System.out.printf("%.5f", result);
                        if (i != inputNo + length - 1) System.out.print(", ");
                    }
                    break;
            }

            System.out.println(); 
        }

        scanner.close();
    }

  
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    public static String getModeName(int mode) {
        switch (mode) {
            case 1: return "Non-linear Sequence";
            case 2: return "Alternative Pattern";
            case 3: return "Multiple and Additive";
            case 4: return "Fraction and Exponential";
            default: return "Error";
        }
    }
}
