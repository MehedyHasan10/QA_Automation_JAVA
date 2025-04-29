package TypeCasting;

public class CheckVariable {
    public static void main(String[] args) {
        Object variable = true;

        if (variable instanceof Integer) {
            System.out.println("The variable is an Integer");
        } else if (variable instanceof String) {
            System.out.println("The variable is a String");
        } else if (variable instanceof Double) {
            System.out.println("The variable is a Double");
        } else if(variable instanceof Boolean){
            System.out.println("The variable is a Boolean");
        }
        else {
            System.out.println("Unknown type");
        }
    }
}

