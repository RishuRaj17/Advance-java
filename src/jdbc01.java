import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc01 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234");

//            String query = "insert into limda( name ) values('rishu'),('raj'),('aditya'),('tushar'),('akshaj')";
            String query = "Select * from limda";


            Statement stmt = con.createStatement();

            ResultSet rs =  stmt.executeQuery(query);

            while (rs.next()){
                int id =  rs.getInt("id");
                String name = rs.getString("name");

                System.out.print(id+" ");
                System.out.println(name);
            }

            System.out.println("table created...");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
