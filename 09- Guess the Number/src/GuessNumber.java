import java.util.Random;
import java.util.Scanner; 

public class GuessNumber {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    int number = random.nextInt(0, 101);
    int guess = -1;

    System.out.println("Guess a magic number between 0 and 100");

    while (guess != number) {
      System.out.print("\nEnter your guess: ");
      guess = input.nextInt();

      if (guess == number)
        System.out.println("Yes, the number is " + number);
      else if (guess > number)
        System.out.println("Your guess is too high");
      else
        System.out.println("Your guess is too low");
      }

    input.close();
  }
}