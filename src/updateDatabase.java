import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class updateDatabase {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234");

            String query = "update limda set name=? where id=?";

            PreparedStatement pstmt = con.prepareStatement(query);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name");
            String name = sc.nextLine();

            System.out.println("Enter id: ");
            int id = sc.nextInt();


            pstmt.setString(1,name);
            pstmt.setInt(2,id);

            int rowsffected = pstmt.executeUpdate();

            if(rowsffected>0){
                System.out.println("rows affected "+ rowsffected);
            }
            else{
                System.out.println("Invalid id");
            }

            System.out.println("love");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
