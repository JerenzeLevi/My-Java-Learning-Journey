import java.util.Scanner;

public class ArrayNiLevi{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[] names = {"Capitano", "Dottore", "Columbina", "Arlecchino", "Furina", "Marionette", "Rosalyn", "Scaramouche", "Levi", "Pierro"};
		
		try {
			System.out.print("Please enter an index number from (0-9) to choose your character: ");
			int index = input.nextInt();
			System.out.print("Your character name is " + names[index]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.print("Error! womp womp! The number you input exceeds the index. Please enter the correct index number ");
		}
	}
}