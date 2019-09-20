import javax.swing.*;
import java.awt.*;
import java.util.*;

public class baklanges{
    public static void main(String[] arg){
        String word;
        word = JOptionPane.showInputDialog(null, "Reverser: ");
        Scanner read = new Scanner(word);
        String str = read.nextLine();
        String reverse = "";
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse  + str.charAt(i);
        }
        JOptionPane.showMessageDialog(null, "Reverse string is: " + reverse);
    }
}