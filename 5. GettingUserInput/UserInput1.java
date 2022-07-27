
import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text line: ");
        String text = input.nextLine();
        System.out.println("Your line is: " + text);

    }
}