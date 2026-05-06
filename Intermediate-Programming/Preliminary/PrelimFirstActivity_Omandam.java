import java.util.Scanner;

public class PrelimFirstActivity_Omandam{
	public static void main(String[] args){
	Scanner i = new Scanner(System.in);
	
	System.out.print("Enter your age: ");
	int age = i.nextInt();
	
	while (age < 17){
		System.out.println("Minor Detected. Please enter a legal age.");
		System.out.print("Enter your age: ");
		age = i.nextInt();
		}
		System.out.print("you are in a legal age.");
	}
}