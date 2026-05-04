import java.util.Scanner;

public class Omandam_FinalExam{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int balance = 0;
		int option;
		int option2;
		int menu = 1;
		int select = 5;
		int finalBalance = 0;
		
		while (menu != 0){
			System.out.println("---  MENU ---");
			System.out.println("1. Order");
			System.out.println("2. Pay");
			System.out.println("0. Exit");
			option = input.nextInt();
			
			switch (option){
				case 1:
					System.out.println("1. Peanut Butter: 30Php");
					System.out.println("2. Chocolate: 20Php");
					System.out.println("3. Bear Brand: 30Php");
					System.out.println("4. Milo: 10Php");
					System.out.println("0. Back");
					
					while (select != 5){
					option2 = input.nextInt();
					if (option2 == 1 || option2 == 3){
							balance = balance + 30;
							option2 = input.nextInt();
					} else if (option2 == 2){
						balance = balance + 20;
							option2 = input.nextInt();
					}else if (option2 == 4){
						balance = balance + 10;
							option2 = input.nextInt();
					}else if (option2 == 0){
						break;
					} else {
						System.out.print("Invalid Number");
						break;
					}
				}
				break;
				case 2:
					System.out.print("Please enter a payment amount: ");
					int payment = input.nextInt();
					balance = finalBalance;
					if (payment > finalBalance){
							int total = payment - finalBalance;
					System.out.println("The total amount of your purchase is " + balance);
					System.out.println("Change: " + total);
					break;
							
						}
			}
		}
	}
}