import java.util.*;
import java.io.*;

public class improvedMathLearning {
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int userInput;
        int result;
        int number1 = random.nextInt(0, 10);
        int number2 = random.nextInt(0, 10);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
            result = number1 - number2;
        }
        else {
            result = number1 - number2;
        }

        System.out.print("What is " + number1 + " - " + number2 + " = ");
        userInput = input.nextInt();

        if (userInput == result) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        

    }
}