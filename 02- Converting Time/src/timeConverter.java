import java.util.*;

public class timeConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userInput;
        int hour;
        int minute;
        int second;

        System.out.print("Enter seconds that you want to convert here: ");
        userInput = input.nextInt();
        hour = userInput / 3600;
        minute = userInput % 3600 / 60;
        second = userInput % 60;

        System.out.println(hour + " hour " + minute + " minutes " + second + " seconds ");

    }
}