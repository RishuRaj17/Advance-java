import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame("Login");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
        f.setResizable(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("User Name: ");
        JTextField t1 = new JTextField();

        l1.setBounds(20,20,100,50);
        t1.setBounds(20,130,100,50);

        JLabel l2 = new JLabel("Password: ");
        l2.setBounds(20,240,100,50);
        JPasswordField p1 = new JPasswordField();
        p1.setBounds(20,350,100,50);

        JButton b1 = new JButton("Login");
        b1.setBounds(60,460,100,100);

        JLabel w = new JLabel();

        w.setBounds(220,460,100,30);

        f.add(w);

        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                w.setText("welcome"+t1.getText());
            }
        });


        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(p1);
        f.add(b1);



    }
}