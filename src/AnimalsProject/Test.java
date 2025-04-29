package AnimalsProject;

public class Test {
    public static void main (String[] args){
        Animal animal = new Animal(25,75.00);
        animal.eatFood();
        animal.printInfo();
        
        Monkey monkey = new Monkey("Banana");
        monkey.eatFood();
        
        Donkey donkey = new Donkey(7,150.0,"Eeyore");
        donkey.printInfo();
    }
}
