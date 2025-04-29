package OOPDemo;

public class Cat extends Animal {
    
    public static String nickName = "Kittey";
    
    private int id;
    
    
    

    public Cat(){

    }
    
    public Cat(String name){
        super(name);
    }

    public Cat(int age){
        super(age);
    }
    
    public Cat(String name, int age,int id){
        super(name, age);
        this.id = id;
    }


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

   @Override
    public void sleep(){
        System.out.println("Cat Sleep");
    }
    
    public void test(){
        super.sleep();
    }
    
    public void animalInfo() {
        super.animalInfo();
        System.out.println("Cat id:" +getId());
        
    }
}
