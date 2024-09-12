import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

public class notepad implements ActionListener {
    JFrame f;
    JTextArea ta;
    JMenuBar mb;
    JMenu file, edit , help;
    JMenuItem save , sellectAll, copy, paste, cut, print;

    notepad(){

        f = new JFrame("JPanel");

        f.setResizable(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);

        mb = new JMenuBar();
        help = new JMenu("help");
        file  = new JMenu("file");
        edit = new JMenu("edit");
        save =new JMenuItem("save");
        sellectAll = new JMenuItem("SelecAll");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        cut = new JMenuItem("cut");
        print = new JMenuItem("print");

        mb.add(file);
        mb.add(edit);
        mb.add(help);
        file.add(save);
        file.add(print);
        edit.add(paste);
        edit.add(copy);
        edit.add(cut);
        edit.add(sellectAll);

        copy.addActionListener(this);
        paste.addActionListener(this);
        sellectAll.addActionListener(this);


        ta = new JTextArea();
        ta.setBounds(30,30,500,500);
        f.setJMenuBar(mb);
        f.add(ta);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==copy){
            ta.copy();
        } else if (e.getSource()==cut) {
            ta.cut();
        } else if (e.getSource()==paste) {
            ta.paste();
        } else if (e.getSource()==print) {
            try {
                ta.print();
            } catch (PrinterException ex) {
                throw new RuntimeException(ex);
            }
        } else if (e.getSource()==sellectAll) {
            ta.selectAll();
        } else if (e.getSource()==save) {

        }
    }
    public static void main(String[] args) {

        new notepad();


    }
}
