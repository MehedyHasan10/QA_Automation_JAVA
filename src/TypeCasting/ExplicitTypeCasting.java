package TypeCasting;

public class ExplicitTypeCasting {
    public static void main(String[] arg){
        //double->float->long->int->short->byte ------------>narrowing
        double x = 10.50;
        int y = (int) x;
        System.out.println(y);
    }
}
