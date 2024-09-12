import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class fileHandling {
    public static void main(String[] args) {
//        try {
            Path p1 = Paths.get("C:\\Users\\HP\\Desktop\\FileHandling\\rishu.txt");
//
//            if(Files.exists(p1)){
//                System.out.println("exsists");
//            }
//            else{
//                Path p2 = Files.createFile(p1);
//                System.out.println("created");
//            }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }


//        Path p1 = Paths.get("C:\\Users\\HP\\Desktop\\FileHandling\\raj");
//
//        try{
//            if(Files.exists(p1)){
//                System.out.println("exsists");
//            }
//            else{
//                Path p2 = Files.createDirectory(p1);
//                System.out.println("created");
//            }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }


//        Path p2 = Paths.get("C:\\Users\\HP\\Desktop\\FileHandling\\raj.txt");

//        try {
//            List<String> data = Files.readAllLines(p2);
//
//            Files.write(p1,data);
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }


//        try{
//            List <String> data = Files.readAllLines(p2);
//
//            for(String str: data){
//                System.out.println(str);
//            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }

//        try{
//
//            Path p2 = Paths.get("C:\\Users\\HP\\Downloads\\rishu.txt");
//
//            Files.copy(p1,p2);
//            System.out.println("copied");
//
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }

//        try{
//            String data = "\n Hello World!";
//
//            Files.write(p1,data.getBytes(), StandardOpenOption.APPEND);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        try {
//            Stream<Path> str = Files.list(p1);
//
//            str.forEach(x->{
//                System.out.println(x.getFileName());
//            });
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
    }
}

//public class fileHandling{
//    public static void main(String[] args) throws IOException {
//        Path p1 = Paths.get("C:\\Users\\HP\\Desktop\\FileHandling\\rishuDir");
//
//        if(Files.exists(p1)){
//             Files.delete(p1);
//            System.out.println("deleted");
//        }
//        else{
//            System.out.println("dosent exists!");
//        }
//    }
//}