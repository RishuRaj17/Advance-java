import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc02 {
    public static void main(String[] args) {

        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234");

            System.out.println("Connection created");
            String query = "Insert into limda (name) values(?)";

            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setString(1,"Bhalu");
            pstmt.executeUpdate();

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
