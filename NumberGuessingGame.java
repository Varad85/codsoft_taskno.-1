import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Add Scanner and Random objects for input and random number generation
        boolean playAgain;
        int totalRounds = 0;
        int totalAttempts = 0;

        do {
            totalRounds++;
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            int maxAttempts = 6; // Maximum attempts per round
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Round " + totalRounds);
            System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
        }
    }
}