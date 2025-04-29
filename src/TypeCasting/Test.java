package TypeCasting;

public class Test {
    public static void main (String[] args){
        Person p = new Teacher();  //upcasting
        p.display();
        
        //java don't support downcasting
        //it don't show error in compiler time but show the error in run time
        Teacher t = (Teacher) new Person();
        t.display();
        
    }
}
