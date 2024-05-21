import java.util.*;
import java.io.*;

public class mathLearning {
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int x = random.nextInt(0, 10);
        int y = random.nextInt(0, 10);
        int result = x + y;
        int userInput;

        System.out.print("What is " + x + " + " + y + " = ? ");
        userInput = input.nextInt();

        if (userInput == result) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}