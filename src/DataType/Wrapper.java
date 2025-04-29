package DataType;

public class Wrapper {
    //convert primitive to object and object to primitive
    //There is two wrapper-> 1.autoboxing 2.unboxing
    
    public static void main(String[] args){
        //primitive to object = autoboxing
        int x = 30;
        Integer y = (x);
        System.out.println(y);
        System.out.println("_____________________________");
        
        //object to primitive = unboxing
        Double d = new Double(10.25);
        System.out.println(d);
        double e = d.intValue();
        System.out.println(e);
    }
}
