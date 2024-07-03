import java.util.*;

public class HexToDec {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int result = 0;
        int power = 0;

        System.out.print("Enter the Hexadecimal value you want to convert to Decimal here: ");
        String userInput = input.next();

        for (int i = userInput.length() - 1; i > -1; i--) {
            char digit = userInput.charAt(i);
            if (digit >= '0' && digit <= '9')
                result += (int)Math.pow(16, power) * Integer.parseInt(userInput.substring(i, i+1));
            else {
                if (digit == 'A')
                    result += (int)(Math.pow(16, power) * 10);
                if (digit == 'B')
                    result += (int)(Math.pow(16, power) * 11);
                if (digit == 'C')
                    result += (int)(Math.pow(16, power) * 12);
                if (digit == 'D')
                    result += (int)(Math.pow(16, power) * 13);
                if (digit == 'E')
                    result += (int)(Math.pow(16, power) * 14);
                if (digit == 'F')
                    result += (int)(Math.pow(16, power) * 15);
            }
            power++;
        }

        System.out.println("Decimal: " + result);
        input.close();
    }
}
