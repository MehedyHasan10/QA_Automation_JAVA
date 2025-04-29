package FileDemo;

import java.io.File;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args){
        try{
            File file = new File("C:/Users/Admin/Desktop/QA/unit_2/unit_8_java/Person/student.txt");
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNext()){
                String id = scanner.next();
                String name = scanner.next();
                System.out.println("ID:"+id+" Name:"+name);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

