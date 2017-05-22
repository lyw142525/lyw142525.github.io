package entity;
public class RedheaddDuck extends Duck {
    public RedheaddDuck() {
        quackBehavior=new MuteQuack();
        flyBehavior=new FlyWithRocket();
    }
    public void display() {
        System.out.println("I can fly with rocket!");
    }
    
}