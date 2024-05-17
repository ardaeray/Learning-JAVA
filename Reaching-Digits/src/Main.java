import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userValue;
        int firstDigit;
        int secondDigit;

        System.out.print("Enter 2-digit integer value here: ");
        userValue = input.nextInt();
        firstDigit = userValue % 10;
        secondDigit = userValue / 10;
        System.out.println("First digit is: " + firstDigit);
        System.out.println("Second digit is: " + secondDigit);
    }
}