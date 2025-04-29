package Loops;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MethodDemo {

    public void anyMethod(String filename){
        try{
            FileReader reader = new FileReader(filename); 
        } catch (FileNotFoundException e ) {
           System.out.println(e);
        }
        
    }
    
    public static void main(String[] args){
    }
}
