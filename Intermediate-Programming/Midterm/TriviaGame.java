import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Questions and Answers
        String[][] questions = {
            {"What is the Derivative of 100", "A) 100", "B) 0", "C) 1", "D) x", "B"},
            {"Which planet is known as the Red Planet?", "A) Mars", "B) Ur Anus", "C) Jupiter", "D) Venus", "A"},
            {"Who wrote 'No Longer Human'?", "A) Robert Greene", "B) Friedrich Nietzsche", "C) Osamu Dazai", "D) William Shakespeare", "C"},
            {"In The 48th Laws of Power wrote by Robert Greene, what is the 4th Law?", "A) Be a Sigma Alpha Male", "B) Never Commit To Anyone", "C) Crush Your Enemy Totally", "D) Always Say Less Than Necessary", "D"},
            {"A 50-year-old male with a severe headache presents with blood pressure 210/130 mmHg and retinal hemorrhage. He is treated with nitroprusside. Which enzyme is directly affected by the active metabolite of this drug?", "A) Phosphodiesterase C", "B) Guanylyl cyclase", "C) Protein kinase A", "D) Tyrosine kinase", "B"}
        };

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(questions[i][j]);
            }
            System.out.print("Your answer: ");
            String answer = scanner.next().toUpperCase();
            
            // Using concat and equalsIgnoreCase
            if (answer.concat("").equalsIgnoreCase(questions[i][5])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + questions[i][5]);
            }
            System.out.println();
        }
        
        System.out.println("Game Over! Your total score is: " + score + "/5");
        scanner.close();
    }
}