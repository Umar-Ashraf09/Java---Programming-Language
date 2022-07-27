package game;
import java.util.Scanner;


public class GuessTheWord2 {

    private boolean play = true;
    private Words3 randomWords3 = new Words3();
    private Scanner scanner = new Scanner(System.in);
    private int rounds = 10;
    private char lastRound;

    public void start() {

        do {
            showWord();
            getInput();
            checkInput();
        }while(play);
    }

    void showWord() {
        System.out.println("You have " + rounds + " tries left.");
        System.out.println(randomWords3);
    }

    void getInput() {
        
        System.out.println("Enter a letter to guess the word: ");
        String userGuess = scanner.nextLine();
        lastRound = userGuess.charAt(0);
    }

    void checkInput() {

        boolean isGuessedRight = randomWords3.guess(lastRound);
        
        if(isGuessedRight) {
            if(randomWords3.isGuessRight()) {
                System.out.println("Congrats, you won!");
                System.out.println("The word is; " + randomWords3);
                play = false;
            }
        }
        else {
            rounds--;

            if(rounds == 0) {
                System.out.println("Game Over!");
                play = false;
            }
        }
    }

    public void end() {
        scanner.close();
    }
}