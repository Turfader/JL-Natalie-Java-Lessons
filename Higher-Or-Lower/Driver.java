
import java.util.Random;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int guess;
        int guessCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 0 and 99. Try and guess it!");

        while (true) {
            guessCount++;
            System.out.println("Enter a number: ");
            guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("You guessed it! I was thinking of " + randomNumber + ". It took you " 
                + guessCount + " guesses.");
                break;
            }
            else if (guess > randomNumber) {
                System.out.println("The number I'm thinking of is lower than " + guess);
            }
            else if (guess < randomNumber) {
                System.out.println("The number I'm thinking of is higher than " + guess);
            }
        }
        scanner.close();
    }
}
