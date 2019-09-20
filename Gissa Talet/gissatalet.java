import java.util.*;
import javax.swing.*;

public class gissatalet{ 
    public static void main(String[] args){
    Random rand = new Random();
    int S = rand.nextInt(100) + 0;
    int G = 0;
    int Points = 0;
        
        int yesno1 = JOptionPane.showConfirmDialog(null,"Do you want to generate a random number between 0 and 100. \n" + "Get as few points as possible!" ,"Generate Number?",JOptionPane.YES_NO_OPTION);
        if(yesno1 == JOptionPane.YES_OPTION)
        {
            while(G != S){
                String Gs = JOptionPane.showInputDialog(null,"What do you think the number is?" + "\n" + "Points = " + Points + ";","Number Generated",JOptionPane.PLAIN_MESSAGE);
                G = Integer.parseInt(Gs);
                if(G < S && G >= 0)
                {
                    JOptionPane.showMessageDialog(null,"Your number was to low go higher!","Higher",JOptionPane.WARNING_MESSAGE);
                    Points += 1;
                }
                if(G > S && G <= 100)
                {
                    JOptionPane.showMessageDialog(null,"Your number was to high go lower!","Lower",JOptionPane.WARNING_MESSAGE);
                    Points += 1;
                }
                if(G == S)
                {
                    JOptionPane.showMessageDialog(null,"Correct My Dude! \n" + "You got " + Points + " Points","Correct!",JOptionPane.PLAIN_MESSAGE);
                    
                }
                if(G > 100)
                {
                    JOptionPane.showMessageDialog(null,"I SAID 0 TO 100 GO LOWER","TO HIGH",JOptionPane.WARNING_MESSAGE);
                    Points += 5; 
                }
                if(G < 0)
                {
                    JOptionPane.showMessageDialog(null,"I SAID 0 TO 100 GO HIGHER","TO LOW",JOptionPane.WARNING_MESSAGE);
                    Points += 5;
                }
            }
        }
        else
        {
            
        }
    }
}