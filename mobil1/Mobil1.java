import javax.swing.JOptionPane;
import java.awt.Toolkit;
import javax.swing.*;

public class Mobil1 {
    public static void main(String[] args){
            String alder;
            String namn;
            String svar1;
            String hälsning;
            namn = JOptionPane.showInputDialog("Vad e ditt namn?");
            alder = JOptionPane.showInputDialog("Hur gammal e du?");
            int g = Integer.parseInt(alder);
            hälsning = "Vaelkommen " + namn;
            svar1 = "For Ung!";
            if (g < 18){
                JOptionPane.showMessageDialog(null, svar1);
            }
            else
                JOptionPane.showMessageDialog(null, hälsning);

    }
}