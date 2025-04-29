package Loops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ListStringDemo {
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<>();

        name.add("Siam");
        name.add("Mehedy");
        name.add("Hasan");
        name.add("Setu");

        List<String> modifiedList = name.stream()
                .filter(names -> names.length() > 5)  
                .map(names -> names + " survey")  
                .collect(Collectors.toList());

        System.out.println(modifiedList);

    }
}

   


