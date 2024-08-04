import java.util.Scanner;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10; 
        
        int totalAttempts = 0;
        int roundsWon = 0;
        
        boolean playAgain = true;
        
        while (playAgain) {
            System.out.println("\n=== New Game ===");
            int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Try to guess the number between " + minRange + " and " + maxRange);
            
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Attempt number " + (attempts + 1) + " out of " + maxAttempts + ": Please enter your guess: ");
                int guess = scanner.nextInt();
                
                if (guess < secretNumber) {
                    System.out.println("Your guess is too low! Please try a higher number.");
                } else if (guess > secretNumber) {
                    System.out.println("Your guess is too high! Please try a lower number.");
                } else {
                    System.out.println("Well done! You have correctly guessed the number " + secretNumber + "!");
                    guessedCorrectly = true;
                }
                
                attempts++;
            }
            
            totalAttempts += attempts;
            
            if (guessedCorrectly) {
                roundsWon++;
            } else {
                System.out.println("Unfortunately, you have used all attempts. The correct number was " + secretNumber + ".");
            }
            
            System.out.print("Would you like to play another round? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();
            
            if (!playChoice.equals("yes")) {
                playAgain = false;
            }
        }
        
        scanner.close();
        
        System.out.println("\nGame over! You won " + roundsWon + " rounds.");
        if (roundsWon > 0) {
            double averageAttempts = (double) totalAttempts / roundsWon;
            System.out.printf("On average, it took you %.2f attempts per round.%n", averageAttempts);
        }
    }
}
