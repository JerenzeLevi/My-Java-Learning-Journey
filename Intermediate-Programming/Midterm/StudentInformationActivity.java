import java.util.Scanner;

public class StudentInformationActivity{
	public static void studentInformation(String name, int age, String course, String department, int yearLevel){
		System.out.println(name + " " + age + " " + course + " " + department + " " + yearLevel);
	}
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = input.nextLine();
		System.out.print("Age: ");
		int age = input.nextInt();
		System.out.print("Course: ");
		String course = input.next();
		System.out.print("Department: ");
		String department = input.next();
		System.out.print("yearLevel: ");
		int yearLevel = input.nextInt();
		
		studentInformation(name, age, course, department, yearLevel);
	}
}