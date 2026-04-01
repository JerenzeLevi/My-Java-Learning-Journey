import java.util.Scanner; 

public class MainActivity {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter Sex: ");
        char sex = input.next().charAt(0);

        System.out.print("Enter Course: ");
        String course = input.nextLine();
        input.nextLine();

        System.out.print("Enter Contact Number: ");
        String number = input.nextLine();

        System.out.println("\n--- Student Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
        System.out.println("Course: " + course);
        System.out.println("Number: " + number);

        input.close();
    }
}

