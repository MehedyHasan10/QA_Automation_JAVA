package Collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> customer = new HashMap<Integer,String>();
        
        
        customer.put(101,"Siam");
        customer.put(102,"Hasan");
        customer.put(103,"Mehedy");
        customer.put(101,"Ziam");
        
        System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
        System.out.println(customer.get(101));
    }
    
}
