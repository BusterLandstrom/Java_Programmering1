import javax.swing.*;
import java.util.*;

public class hi{
    public static void main(String[] args){
        String[] situations = {"Natural dissaster","Zombies","Dictationship","Aliens","Technology/Steampunklike","War"};
        String[] naturald = {"Meteor","Greenhouse effect","Disease"};

        String sit = (situations[new Random().nextInt(situations.length)]);
        String natSub = (naturald[new Random().nextInt(naturald.length)]);

        if(sit !
                = "Natural dissaster"){
            JOptionPane.showMessageDialog(null,"Theme: " + sit ,"ThemeGenerator",JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Theme: " + sit + "\n" + "Subtheme: " + natSub,"ThemeGenerator",JOptionPane.PLAIN_MESSAGE);
        }

    }
}