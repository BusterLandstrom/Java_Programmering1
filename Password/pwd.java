import java.util.*;

public class pwd{
    public static void main(String[] args){
        String pwd = "oof";
        String guess = "";
        int guessesLeft = 3;
        Scanner in  = new Scanner(System.in);
        System.out.println("Password");
        
        while (!guess.equals(pwd) && guessesLeft>0) {
            guess= in.nextLine();
        guessesLeft = guessesLeft-1;
        }
        if(guess.equals(pwd)) {
                System.out.println("success");
        }
        else {
            System.out.println("inte ajaj");
        }
        if(guessesLeft == 0) {
            System.exit(0);
        }
    }
}