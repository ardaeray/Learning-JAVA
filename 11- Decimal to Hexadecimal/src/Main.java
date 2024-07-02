import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";

        System.out.println("Enter the Decimal number you want to convert to Decimal here: ");
        int inputDecimal = input.nextInt();

        while(inputDecimal != 0) {
            hexDigit = inputDecimal % 16;
            inputDecimal = inputDecimal / 16;

            if (hexDigit < 10 && hexDigit >= 0) {
                result = "" + hexDigit + result;
            }
            else {
                if (hexDigit == 10)
                    result = "A" + result;
                if (hexDigit == 11)
                    result = "B" + result;
                if (hexDigit == 12)
                    result = "C" + result;
                if (hexDigit == 13)
                    result = "D" + result;
                if (hexDigit == 14)
                    result = "E" + result;
                if (hexDigit == 15)
                    result = "F" + result;
            }
        }
    }
}