import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            Random rd = new Random();

            int minRange = 1;
            int maxRange = 100;
            int maxAttempts = 10;
            int rounds = 0;
            int totalAttempts = 0;

            boolean playAgain = true;

            while(playAgain)
            {
                int generatedNumber = rd.nextInt(maxRange - minRange + 1) + minRange;
                System.out.println("Welcome to the Number Guessing Game!");
                System.out.println("Guess a number between " + minRange + " and " + maxRange + ".");

                int attempts = 0;
                boolean guessedCorrectly = false;

                while(!guessedCorrectly && attempts < maxAttempts)
                {
                    System.out.print("Enter your guess: ");
                    int userGuess = sc.nextInt();
                    attempts++;
                    totalAttempts++;

                    if(userGuess == generatedNumber)
                    {
                        System.out.println("Congratulations! You guessed the correct number: " + generatedNumber);
                        System.out.println("Attempts taken: " + attempts);
                        guessedCorrectly = true;
                    }
                    else if(userGuess < generatedNumber)
                    {
                        System.out.println("Too low! Try again.");
                    }
                    else
                    {
                        System.out.println("Too high! Try again.");
                    }
                }
                if(attempts==maxAttempts)
                {
                    System.out.println("Sorry, you have reached the maximum number of attempts.");
                    System.out.println("The correct number was: " + generatedNumber);
                }

                rounds++;
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgainResponse = sc.next();
                playAgain = playAgainResponse.equalsIgnoreCase("yes");
            }

            System.out.println("Game over. Total rounds played: " + rounds);
            System.out.println("Total attempts made: " + totalAttempts);
            sc.close();
        }
    }