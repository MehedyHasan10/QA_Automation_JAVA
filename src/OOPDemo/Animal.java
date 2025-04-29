package OOPDemo;

public class Animal {
    public String name = "Tiger";
    public int age;
    
    public Animal(){
        
    }

    public Animal(String name){
        this.name = name;
    }

    public Animal( int age){
        this.age=age;
    }
    
    
    public Animal(String name, int age){
        this.name = name;
        this.age=age;
    }
    
    public void animalInfo(){
        //System.out.println("Animal Name:"+name);
        System.out.println(String.format("An animal name : %s",name));
        
        System.out.println("Animal Age:"+age);
    }
    
    
    
    public void speak(){
        System.out.println("Animal Speaks");
    }
    
    public void speak(String language){
        System.out.println("Speaking:"+language);
    }
    
    public void sleep(){
        System.out.println("Animal Sleeps");
    }
    
    
}
