import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class radio {
    public static void main(String[] args) {
        JFrame f = new JFrame("Radio");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true);

        JRadioButton rb = new JRadioButton("Single");
        rb.setBounds(20, 30,100,30);
        f.add(rb);
        JRadioButton rb2 = new JRadioButton("Married");
        rb2.setBounds(20,70,100,30);
        f.add(rb2);

        JButton b = new JButton("Submit");
        b.setBounds(20,110,100,30);
        f.add(b);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb);
        bg.add(rb2);

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e){
                if(rb.isSelected()){
                    System.out.println(rb.getText());
                } else if (rb2.isSelected()) {
                    System.out.println(rb2.getText());
                }
            }

        });


    }
}
