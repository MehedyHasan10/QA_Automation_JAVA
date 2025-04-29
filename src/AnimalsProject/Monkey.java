package AnimalsProject;

public class Monkey extends Animal{
    private String food;
    
    public Monkey(int age, double weight, String food){
        super(age, weight);
        this.food = food;
    }

    public Monkey(String food){
        this.food = food;
    }
    
    @Override
    public void eatFood(){
        System.out.println("This monkey loves:"+food);
    }
}
