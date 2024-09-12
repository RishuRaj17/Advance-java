import javax.swing.*;
import java.awt.*;

public class panel {

    public static void main(String[] args) {
        JFrame f = new JFrame("JPanel");

        f.setResizable(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);

        JPanel jp = new JPanel();
        jp.setBounds(20,30,300,300);
        jp.setBackground(Color.red);
        JButton b = new JButton("Submit");
        b.setBounds(10,10,80,30);
        jp.add(b);
        f.add(jp);
    }
}
