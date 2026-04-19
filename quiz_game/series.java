import java.util.Scanner;

class QuizGame {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variable to store correct answers count
        int score = 0;

        // Variable to store user answer
        char answer;

        System.out.println("---- Questions Game ----");

        // Question 1
        System.out.println("\n1. What is the capital of Kenya?");
        System.out.println("A. Mombasa");
        System.out.println("B. Nairobi");
        System.out.println("C. Kisumu");
        System.out.println("D. Nakuru");

        answer = getValidInput(input);

        switch (answer) {
            case 'B':
                score++;
                break;
        }

        // Question 2
        System.out.println("\n2. Which language is used for Android development?");
        System.out.println("A. Python");
        System.out.println("B. Swift");
        System.out.println("C. Java");
        System.out.println("D. C#");

        answer = getValidInput(input);

        if (answer == 'C') {
            score++;
        }

        // Question 3
        System.out.println("\n3. What does a soc analyst do?");
        System.out.println("A. Security hacking officer");
        System.out.println("B. blue hat hacker");
        System.out.println("C. Security operations officer");
        System.out.println("D. ethical company hacker");

        answer = getValidInput(input);

        switch (answer) {
            case 'C':
                score++;
                break;
        }

        // Question 4
        System.out.println("\n4. Which company developed Java?");
        System.out.println("A. Microsoft");
        System.out.println("B. Apple");
        System.out.println("C. Sun Microsystems");
        System.out.println("D. Google");

        answer = getValidInput(input);

        if (answer == 'C') {
            score++;
        }

        // Question 5
        System.out.println("\n5. Which data type is used to store text?");
        System.out.println("A. int");
        System.out.println("B. double");
        System.out.println("C. char");
        System.out.println("D. String");

        answer = getValidInput(input);

        switch (answer) {
            case 'D':
                score++;
                break;
        }

        // Calculate percentage
        double percentage = (score / 5.0) * 100;

        // Display final result
        System.out.println("\n===== Quiz Completed =====");
        System.out.println("Correct Answers: " + score + "/5");
        System.out.println("Score: " + percentage + "%");

        // Close scanner
        input.close();
    }

    //Enters choices
    public static char getValidInput(Scanner input) {
        char answer;

        while (true) {
            System.out.print("Enter your answer (A, B, C, D): ");
            answer = input.next().toUpperCase().charAt(0);

            // Input validation using if statement
            if (answer == 'A' || answer == 'B' || answer == 'C' || answer == 'D') {
                return answer;
            } else {
                System.out.println("Invalid input. Please enter A, B, C, or D.");
            }
        }
    }
}