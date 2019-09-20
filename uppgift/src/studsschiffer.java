import javax.swing.*;
import java.lang.*;

public class studsschiffer {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Rad(er)?", "rad", JOptionPane.WARNING_MESSAGE));
        int m = Integer.parseInt(JOptionPane.showInputDialog(null, "Kolumn(er)?", "kolumn", JOptionPane.WARNING_MESSAGE));
        String ord = JOptionPane.showInputDialog(null, "Krypterade texten?", "text", JOptionPane.WARNING_MESSAGE);

        int f = 0;
        int s = 0;
        int g = 0;
        int x = 2;
        int rutor;
        rutor = n * m;
        System.out.println(rutor);

        int length=ord.length()/n;


        for(int i = 0; i < ord.length(); i++) {
            if (ord.length() > n) {
                char result = ord.charAt(f);
                f += s + n;
                g += (s + n)/x;
                char result2 = ord.charAt(g);
                System.out.println(result);
                System.out.println(result2);
            } else {
                System.out.println(ord);
            }
        }
    }
}
