package CODSOFT;
import java.util.Random;
import java.util.Scanner;

public class Guessnum {

     public static void main(String[] args) {
        int lowerBound = 1; 
        int upperBound = 50; 
        int secretNumber = 15;    // or generateRandomNumber(lowerBound, upperBound);

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("Can you guess the number?");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Try again! The secret number is higher.");
            } else {
                System.out.println("Try again! The secret number is lower.");
            }
        } while (true);

        scanner.close();
    }

    
    private static int generateRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}
