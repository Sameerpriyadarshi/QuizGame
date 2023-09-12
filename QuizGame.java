import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define questions and their answer choices
        String[] questions = {
            "What is the capital of France?",
            "What is the largest planet in our solar system?",
            "What is 2 + 2?",
        };
        
        String[][] choices = {
            {"A) London", "B) Berlin", "C) Paris", "D) Madrid"},
            {"A) Mars", "B) Venus", "C) Jupiter", "D) Saturn"},
            {"A) 3", "B) 4", "C) 5", "D) 6"}
        };
        
        char[] answers = {'C', 'C', 'B'};
        
        int score = 0;
        
        // Display questions and get user's answers
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String choice : choices[i]) {
                System.out.println(choice);
            }
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);
            
            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was " + (char)(answers[i] + 32) + ".\n");
            }
        }
        
        // Display final score
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + " out of " + questions.length);
    }
}
