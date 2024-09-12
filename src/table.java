import javax.swing.*;

public class table {
    table(){
        JFrame f = new JFrame("table");
        f.setResizable(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);


        String [][] data ={{"1","Rishu"},{"2","Raj"},{"3","Raju"},{"4","Tishu"},{"5","Bishu"},};
        String [] col = {"Roll No.", "Name"};
        JTable tb = new JTable(data,col);

        JScrollPane sp = new JScrollPane(tb);
        sp.setBounds(20,30,100,70);
        f.add(sp);
    }
    public static void main(String[] args) {
        new table();
    }
}
