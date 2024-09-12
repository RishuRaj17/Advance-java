import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class dynamicJDBC {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java",
                    "root", "1234");

            String query = "insert into limda (name) values(?)";

            PreparedStatement pstmt = con.prepareStatement(query);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            pstmt.setString(1,name);

            pstmt.executeUpdate();

            System.out.println("done");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
