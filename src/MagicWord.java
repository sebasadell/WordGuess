import java.util.Scanner;

public class MagicWord {
    String[] options = {"fantasy", "decline", "company", "costume", "looting", "kitchen", "testing", "failure", "general", "mystery"};
    boolean[] booleanArray = new boolean[options.length];
    private String hiddenWord;
    char c;
    String s;

    public void setHiddenWord(){
        int i = (int) (Math.random() * options.length);
        hiddenWord = options[i];
    }

    public void printWord(){
        for(int i = 0; i < hiddenWord.length(); i++){
            if(booleanArray[i]){
                System.out.print(hiddenWord.charAt(i));
            }
            else{
                System.out.print("_");
            }
        }
    }

    public void changeLetter(char c){
        for(int i = 0; i < hiddenWord.length(); i++){
            if(hiddenWord.charAt(i) == c){
                booleanArray[i] = true;
            }
        }
    }

    public void checkWord(String s){
        for(int i = 0; i < hiddenWord.length(); i++){
            if(hiddenWord.charAt(i) == s.charAt(i)){
                booleanArray[i] = true;
            }
        }
    }

    public boolean isRight(){
        if(booleanArray[0] == true && booleanArray[1] == true && booleanArray[2] == true && booleanArray[3] == true && booleanArray[4] == true && booleanArray[5] == true && booleanArray[6] == true){
            return true;
        }
        else{
            return false;
        }
    }
}