package partADemo;

public class MultipleVarargsDemo {
    
    public static void printItems(int id, String... items) {
        System.out.println("ID: " + id);
        
        System.out.println("Items:");
        for (String item : items) {
            System.out.println(item);
        }

        System.out.println(); 
    }
    public static void main(String[] args) {
        printItems(1, "Banana", "Orange");
        printItems(2, "Banana");
        printItems(3, "Grapes");
        printItems(4,"Orange","Banana","Grapes","Mango");
    }
}
