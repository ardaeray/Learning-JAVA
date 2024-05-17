import java.util.*;

public class convertTemperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double userInput;
        double celsius;

        System.out.print("Enter Fahrenheit degree to here: ");
        userInput = input.nextInt();
        celsius = (((userInput - 32) * 5) / 9);
        System.out.println("The weather is " + celsius + " celcius.");
    }
}