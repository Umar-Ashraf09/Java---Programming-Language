
import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Variable types supported by switch statements: char, byte, short, int and String

        System.out.println("Enter your instruction: ");
        String text = input.nextLine();

        switch(text) {
            case "run":
                System.out.println("Program is running");
                break;
            case "stop":
                System.out.println("Program stopped");
                break;
            default:
                System.out.println("Instructions not recognized");
        }
    }
}