import java.util.Scanner;

public class ForLoopActivity{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for a loop: ");
		int number = input.nextInt();
		
		for (int i = 1; i <= number; i++){
			if (i % 2 == 0){
				System.out.println(i);
			}else { 
				System.out.println("*");
				}
			}
		}
	} 