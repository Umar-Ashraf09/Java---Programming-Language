
import java.util.Scanner;

public class UserInput3 {
    public static void main(String[] args) {

        // The Single line comment

        /* The Multiline
        comment*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        double number = input.nextDouble();
        System.out.println("Your number is: " + number);

    }
}