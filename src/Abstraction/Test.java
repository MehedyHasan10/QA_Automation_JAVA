package Abstraction;

public class Test {
    public static void main(String[] args){
        MobileUser mobileUser;
        mobileUser = new Siam();
        mobileUser.sendMessage();

        mobileUser = new Aleksey();
        mobileUser.sendMessage();
        
    }
}
