import java.util.*;
import javax.swing.*;

public class password{
    public static void main(String[] args){
        String nem = JOptionPane.showInputDialog(null,"What is your name?","Name?",JOptionPane.QUESTION_MESSAGE);
        String pwd = JOptionPane.showInputDialog(null,"What is the password you want?","Password",JOptionPane.QUESTION_MESSAGE);
        int pwdGuessesLeft = 3;
        int nemGuessesLeft = 3;
        String guessNem = "";
        String guessPwd = "";
        
        int oof = JOptionPane.showConfirmDialog(null,"Do you want to login?","Login",JOptionPane.YES_NO_OPTION);
        
        if (oof == JOptionPane.YES_OPTION){
            while(!guessNem.equals(nem) && nemGuessesLeft>0){
                guessNem = JOptionPane.showInputDialog(null,"Username:","Login",JOptionPane.PLAIN_MESSAGE);
                nemGuessesLeft = nemGuessesLeft-1;
            }
                while(!guessPwd.equals(pwd) && pwdGuessesLeft>0){
                    guessPwd = JOptionPane.showInputDialog(null,"Password:","Login",JOptionPane.PLAIN_MESSAGE);
                    pwdGuessesLeft = pwdGuessesLeft-1;
                }
                if(pwdGuessesLeft == 0){
                    JOptionPane.showMessageDialog(null,"Error you have been locked out of your account for 10seconds!","Error!",JOptionPane.WARNING_MESSAGE);
                    System.exit(0);
                }
                if(nemGuessesLeft == 0){
                    JOptionPane.showMessageDialog(null,"Error you have been locked out of your account for 10seconds!","Error!",JOptionPane.WARNING_MESSAGE);
                    System.exit(0);
                }
            }
        }        
    }
