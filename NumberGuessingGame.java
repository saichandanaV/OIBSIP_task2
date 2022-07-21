import java.util.*;

public class NumberGuessingGame{
    public static int scoreGenerator(int n) {
        int score = 0;
        switch (n) {
            case 0:
                score = 500;
                break;
            case 1:
                score = 100;
                break;
            case 2:
                score = 70;
                break;
            case 3:
                score = 50;
                break;
            case 4:
                score = 25;
                break;
            default:
                break;
        }
        return score;
    }

    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int trials = 5;
        int i, guess;
        System.out.println("               ***WELCOME TO NUMBER GUESSING GAME***                 ");
        System.out.println("A number is chosen between 1 to 100.Guess the number within 5 trials.");
        System.out.println("Game Instructions:");
        System.out.println("Based on attempts you will be awarded the score.\n" +
                "If number guessed at:\n attempt1 : score is 500\n" +
                " attempt2 : score is 100\n attempt3 : score is 70\n attempt4 : score is 50\n attempt5 : score is 25");
        for (i = 0; i < trials; i++) {
            System.out.println("Guess the number:");
            // Take input for guessing
            guess = sc.nextInt();
            // If the number is guessed
            if (number == guess) {
                System.out.println("Congratulations! You guessed the number.\n Your Score:" + scoreGenerator(i));

                break;
            } else if (number > guess && i != trials - 1) {
                System.out.println("The number is greater than " + guess);
            } else if (number < guess && i != trials - 1) {
                System.out.println("The number is less than " + guess);
            }
        }

        if (i == trials) {
            System.out.println("You have exhausted 5 trials.\nYour Score:0");
            System.out.println("The number was " + number);
            System.out.println("Better Luck next time!:)");
        }
    }

    public static void main(String arg[]) {
        guessingNumberGame();
    }
}
