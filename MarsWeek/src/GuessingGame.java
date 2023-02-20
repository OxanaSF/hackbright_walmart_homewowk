import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class GuessingGame {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("Hi!");
    System.out.println("What is your name?");

    Scanner scanner = new Scanner(System.in);
    String playerName = scanner.nextLine();

    System.out.println("Welcome to the game.");
    System.out.println("Guess a number between 1 and 100.");
    guessingGame(scanner, playerName);

  }

  public static void guessingGame(Scanner scanner, String playerName) {
    Random rand = new Random();
    int number = rand.nextInt(100);
    int cnt = 0;

    while (true) {
      try {
          int guess = scanner.nextInt();
          cnt += 1;
          if (guess < 1 || guess > 100 ) {
            System.out.println("Invalid number. Chose number between 1 and 100.");
            continue;
          }
          if (guess > number) {
            scanner.nextLine();
            System.out.println("Your guess is larger than my number.");
          } else if (guess < number) {
            scanner.nextLine();
            System.out.println("Your guess is smaller than my number.");
          } else {
            scanner.nextLine();
            System.out.println("Correct! " + "Good job, " + playerName + "!");
            break;
          }
        }

        catch (InputMismatchException e) {
          scanner.nextLine();
          System.out.println("You need to put an integer.");
        }
      }
    }
  }
