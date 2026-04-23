import java.util.Scanner;

public class AlphabetToNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter (A-Z): ");
        char letter = input.next().charAt(0);

        switch (letter) {
            case 'A': case 'a': System.out.println("1"); break;
            case 'B': case 'b': System.out.println("2"); break;
            case 'C': case 'c': System.out.println("3"); break;
            case 'D': case 'd': System.out.println("4"); break;
            case 'E': case 'e': System.out.println("5"); break;
            case 'F': case 'f': System.out.println("6"); break;
            case 'G': case 'g': System.out.println("7"); break;
            case 'H': case 'h': System.out.println("8"); break;
            case 'I': case 'i': System.out.println("9"); break;
            case 'J': case 'j': System.out.println("10"); break;
            case 'K': case 'k': System.out.println("11"); break;
            case 'L': case 'l': System.out.println("12"); break;
            case 'M': case 'm': System.out.println("13"); break;
            case 'N': case 'n': System.out.println("14"); break;
            case 'O': case 'o': System.out.println("15"); break;
            case 'P': case 'p': System.out.println("16"); break;
            case 'Q': case 'q': System.out.println("17"); break;
            case 'R': case 'r': System.out.println("18"); break;
            case 'S': case 's': System.out.println("19"); break;
            case 'T': case 't': System.out.println("20"); break;
            case 'U': case 'u': System.out.println("21"); break;
            case 'V': case 'v': System.out.println("22"); break;
            case 'W': case 'w': System.out.println("23"); break;
            case 'X': case 'x': System.out.println("24"); break;
            case 'Y': case 'y': System.out.println("25"); break;
            case 'Z': case 'z': System.out.println("26"); break;
            default:
                System.out.println("Invalid input! Please enter a letter.");
                break;
        }

        input.close();
    }
}