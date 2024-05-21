import java.util.*;

public class answerLoop {
  public static void main(String[] args) {
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    int answer;

    Scanner input = new Scanner(System.in);

    System.out.print("What is " + number1 + " + " + number2 + "? ");
    answer = input.nextInt();
    
    while (number1 + number2 != answer) {
      System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
      answer = input.nextInt();
    }

    System.out.println("You got it!");

    input.close();
  }
}