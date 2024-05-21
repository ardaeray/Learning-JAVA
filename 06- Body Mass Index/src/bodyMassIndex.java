import java.util.*;

public class bodyMassIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String definedAs = "";
        double weight;
        double height;
        double BMI;

        System.out.println("You need to 16 years or older to be able to calculate your BMI!");

        System.out.print("Enter your weight in kilograms: ");
        weight = input.nextDouble();
        System.out.print("Enter your height in centimeters: ");
        height = input.nextDouble();
        height = height / 100;
        BMI = weight / Math.pow(height, 2);

        if (BMI < 18.5) {
            definedAs = "Underweight";
        }
        else if (BMI >= 18.5 && BMI < 25.0) {
            definedAs = "Normal";
        }
        else if (BMI >= 25.0 && BMI < 30.0) {
            definedAs = "Overweight";
        }
        else if (BMI >= 30.0) {
            definedAs = "Obese";
        }

        System.out.println("Your BMI is: " + BMI + ", so you are: " + definedAs);

        input.close();
    }
}