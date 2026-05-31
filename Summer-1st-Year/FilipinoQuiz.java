import java.util.Scanner;

public class FilipinoQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Who was the first Filipino to win a gold medal at the Olympics?",
            "2. What does the title of José Rizal's book Noli Me Tangere translate to?",
            "3. Who composed the music for the Philippine national anthem, 'Lupang Hinirang'?",
            "4. In what year did Ferdinand Marcos Sr. declare martial law?",
            "5. Which city is known as the 'Summer Capital of the Philippines'?",
            "6. What do Filipino children traditionally do during the New Year's Eve to get taller?",
            "7. What was the first full-length Filipino film directed by Jose Nepomuceno, premiered in 1919?",
            "8. Who is the Filipino boxer nicknamed 'Ahas'?",
            "9. Who was the first Filipina to win the Miss Universe title?",
            "10. The folklore creature tikbalang has the body of a human and the head of which animal?",
            "11. What term refers to a subculture known for using capital letters and symbols in writing/texting?",
            "12. What is the longest river in the Philippines?",
            "13. Which Filipino revolutionary leader is regarded as the 'Brains of the Revolution'?",
            "14. During what month does the Christmas season unofficially start in the Philippines?",
            "15. What is the traditional Filipino practice called when the community helps move a house?",
            "16. What is the national fish of the Philippines?",
            "17. On what date is the birthday of José Rizal?",
            "18. Which famous Philippine volcano is known for its perfect cone shape?",
            "19. Who was the first female president of the Philippines?",
            "20. Who is the Filipino singer known as 'Asia's Songbird'?",
            "21. Who was the youngest among the three prince brothers sent to capture Ibong Adarna?",
            "22. What is the traditional Filipino dance with bamboo poles?",
            "23. The Philippine Eagle is also known as the ______ eating eagle.",
            "24. What should you do if you're lost, according to superstition?",
            "25. What is the traditional genre of Filipino love songs?"
        };

        String[][] options = {
            {"a) Onyok Velasco", "b) Hidilyn Diaz", "c) Carlos Yulo", "d) Efren Reyes"},
            {"a) The Untouchable", "b) Do Not Disturb", "c) Touch Me Not", "d) Hands Off"},
            {"a) Julian Felipe", "b) Antonio Molina", "c) Jose Palma", "d) Levi Celerio"},
            {"a) 1970", "b) 1972", "c) 1975", "d) 1980"},
            {"a) Tagaytay", "b) Sagada", "c) Boracay", "d) Baguio"},
            {"a) Jump", "b) Sleep early", "c) Put coins in their pockets", "d) Stretch"},
            {"a) Ang Tatlong Hambog", "b) Dalagang Bukid", "c) Tatlong Maria", "d) Noli Me Tangere"},
            {"a) Nonito Donaire", "b) Manny Pacquiao", "c) Donnie Nietes", "d) Gabriel Elorde"},
            {"a) Pia Wurtzbach", "b) Gloria Diaz", "c) Catriona Gray", "d) Margie Moran"},
            {"a) Eagle", "b) Tiger", "c) Dog", "d) Horse"},
            {"a) Bayong", "b) Sawsawero", "c) Taga", "d) Jejemon"},
            {"a) Cagayan River", "b) Agusan River", "c) Rio Grande de Mindanao", "d) Pampanga River"},
            {"a) Emilio Jacinto", "b) Andres Bonifacio", "c) Apolinario Mabini", "d) Gregorio del Pilar"},
            {"a) August", "b) September", "c) October", "d) November"},
            {"a) Kapwahan", "b) Salu-salo", "c) Pagtutulungan", "d) Bayanihan"},
            {"a) Tilapia", "b) Lapu-Lapu", "c) Bangus", "d) Dalagang Bukid"},
            {"a) June 19", "b) December 30", "c) March 15", "d) August 21"},
            {"a) Taal", "b) Pinatubo", "c) Mayon", "d) Kanlaon"},
            {"a) Gloria Macapagal Arroyo", "b) Corazon Aquino", "c) Leni Robredo", "d) Miriam Defensor Santiago"},
            {"a) Lea Salonga", "b) Sarah Geronimo", "c) Sharon Cuneta", "d) Regine Velasquez"},
            {"a) Don Pedro", "b) Don Diego", "c) Don Juan", "d) Don Carlos"},
            {"a) Tinikling", "b) Singkil", "c) Pandanggo sa Ilaw", "d) Kuratsa"},
            {"a) Lemur", "b) Monkey", "c) Snake", "d) Squirrel"},
            {"a) Be silent and pray", "b) Whistling loudly", "c) Stop for 30 minutes", "d) Turning your shirt inside out"},
            {"a) Harana", "b) Tugtugin", "c) Kundiman", "d) Balitaw"}
        };

        char[] answers = {
            'b','c','a','b','d',
            'a','b','c','b','d',
            'd','a','c','b','d',
            'c','a','c','b','d',
            'c','a','b','d','c'
        };

        int score = 0;

        System.out.println("🇵🇭 Welcome to the Filipino Trivia Quiz! 🇵🇭\n");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String opt : options[i]) {
                System.out.println(opt);
            }
            System.out.print("Your answer: ");
            char ans = sc.next().toLowerCase().charAt(0);

            if (ans == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! The correct answer is " + answers[i] + "\n");
            }
        }

        System.out.println("🎉 Quiz Finished! You scored " + score + "/" + questions.length);
        sc.close();
    }
}

