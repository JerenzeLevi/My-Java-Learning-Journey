import java.util.Scanner;
public class levi{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("== Calculator ==");

        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter an operator: ");
        char operator = input.next().charAt(0);
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();



        if (operator == '+'){
            int sum = num1 + num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + sum);
        } else if(operator == '-'){
            int diff = num1 - num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + diff);
        } else if(operator == '*'){
            int product = num1 * num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + product);
        } else if (operator=='/'){
            int quotient = num1 / num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + quotient);
        } else{
            System.out.println("OPERATOR PLSSSS");
        }

    }
}