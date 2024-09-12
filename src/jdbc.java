import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234");

            String query = "Select * From employee";

            Statement stmt = con.createStatement();

            ResultSet set =  stmt.executeQuery(query);

            while(set.next()){
                int id =  set.getInt("id");
                String name = set.getString("name");

                System.out.print(id+" ");
                System.out.println(name);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
