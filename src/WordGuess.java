import java.util.Scanner;

public class WordGuess {
    public static void main(String[] argv){
        MagicWord game = new MagicWord();
        boolean guessed = false;
        int attempts = 0;
        String keyboard;
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("GAME START!");
        game.setHiddenWord();

        while(!guessed){
            attempts++;
            System.out.print("Enter one character or your guess word: ");
            keyboard = inputValue.next();
            if(keyboard.length() == 1){
                char c = keyboard.charAt(0);
                game.changeLetter(c);
                System.out.print("Attempt " + attempts + ": ");
                game.printWord();
                System.out.println();
                if(game.isRight()){
                    guessed = true;
                }
            }
            else{
                game.checkWord(keyboard);
                if(game.isRight()){
                    guessed = true;
                }
                else{
                    System.out.println("Wrong! Try again");
                    System.out.print("Attempt " + attempts + ": ");
                    game.printWord();
                    System.out.println();
                }
            }
        }
        System.out.println("Congratulations!");
        System.out.println("You got it in " + attempts + " attempts.");
    }
}