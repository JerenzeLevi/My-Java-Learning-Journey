import java.util.Scanner;

public class MidtermExamination {
    
	public static void main(String[]args) {
		Scanner cutie = new Scanner(System.in);
		
		System.out.println("Positive or negative number detector");
		System.out.print("Enter number: ");
		int inputNimo = cutie.nextInt();
		if (inputNimo >= 0){
			System.out.print("The number is positive.");
		}
		else {
			System.out.print("The number is negative.");
		}	

        cutie.close();
	}
}

