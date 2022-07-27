
import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int aValue = input.nextInt();
        System.out.println("Your number is: " + aValue);

    }
}