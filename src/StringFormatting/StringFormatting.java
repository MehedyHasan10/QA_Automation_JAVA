package StringFormatting;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "Siam";
        String formattedString = String.format("Hello, %s!", name);
        System.out.println(formattedString); 
        
        int age = 25;
        String ageMessage = String.format("I am %d years old.", age);
        System.out.println(ageMessage); 
        
        double price = 10.456;
        String priceMessage = String.format("The price is $%.2f.", price);
        System.out.println(priceMessage); 
        
        String fullMessage = String.format("%s is %d years old and has $%.2f in my wallet.", name, age, price);
        System.out.println(fullMessage);
    }
}
