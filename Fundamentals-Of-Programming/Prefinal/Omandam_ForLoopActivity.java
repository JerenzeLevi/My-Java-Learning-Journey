import java.util.Scanner;

public class Omandam_ForLoopActivity{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = input.nextLine();
				System.out.print("How many times do you wanna loop it?\nEnter number: ");
				int digit = input.nextInt();
		
		
		
		for (int i = 1; i <= digit; i++ ){
			System.out.println(name);
		}
	}
}