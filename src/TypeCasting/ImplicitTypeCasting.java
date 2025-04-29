package TypeCasting;

public class ImplicitTypeCasting {
    public static void main(String[] arg){
        //byte->short->int->long->float->double ------------>widening
        int x = 10;
        double y = x;
        System.out.println(y);
    }
}
