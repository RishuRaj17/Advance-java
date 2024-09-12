import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class comboBox {
    public static void main(String[] args) {
        JFrame f = new JFrame("Combo Box");

        f.setResizable(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);

        String[] color = {"red","blue","green"};
        JComboBox cb = new JComboBox<String>(color);
        cb.setBounds(20,30,150,30);
        f.add(cb);

        cb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = (String) cb.getSelectedItem();

                switch (s){
                    case "red":
                        f.getContentPane().setBackground(Color.red);
                        break;
                    case "blue":
                        f.getContentPane().setBackground(Color.blue);
                        break;
                    case "green":
                        f.getContentPane().setBackground(Color.green);
                        break;
                }
            }
        });
    }
}
