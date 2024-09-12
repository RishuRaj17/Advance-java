import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkBox {
    public static void main(String[] args) {
        JFrame f = new JFrame("CheckBox");
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox ch = new JCheckBox("Married");
        ch.setBounds(20, 30,150,30);
        f.add(ch);

        JCheckBox ch2 = new JCheckBox("Single");
        ch2.setBounds(20,70,150,30);
        f.add(ch2);

        JLabel l = new JLabel();
        l.setBounds(20,110,150,30);
        f.add(l);

        JButton b = new JButton("Submit");
        b.setBounds(20,150,100,30);
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(ch.isSelected()){
                    l.setText(ch.getText());
                } else if (ch2.isSelected()) {
                    l.setText(ch2.getText());
                }
                else{
                    l.setText("");
                }
            }
        });
    }
}
