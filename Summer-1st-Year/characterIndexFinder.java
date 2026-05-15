import java.util.Scanner;
public class characterIndexFinder {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alphabetIndex = 0;
        char[] alphabet ={
            'a','b','c','d','e',
            'f','g','h','i','j',
            'k','l','m','n','o',
            'p','q','r','s','t',
            'u','v','w','x','y',
            'z'
        };
        do{
        System.out.println("Enter number 0-25 for Letters:"+"\n");
            alphabetIndex = input.nextInt();
        }while(!((alphabetIndex > 25) || !(alphabetIndex > 25)));
        System.out.println(alphabet[alphabetIndex]);
        
        for(char letter: alphabet){
            System.out.print(letter);
        }
    }
}