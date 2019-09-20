import javax.swing.*;

public class kuber {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        int sum = 0;

       int n =  Integer.parseInt(JOptionPane.showInputDialog(null,"How many times?","",JOptionPane.PLAIN_MESSAGE));

        for(int i = 0; i < n ; i++) {
            x += 1;
            y += 1;
            z += 1;
            System.out.println(x * y * z);
            sum += x*y*z;
        }
        System.out.println(sum);
    }
}
