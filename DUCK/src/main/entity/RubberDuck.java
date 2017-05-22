package entity;
public class RubberdDuck extends Duck {
    public RubberdDuck() {
        quackBehavior=new SQuack();
        flyBehavior=new FlyNoWay();
    }
    public void display() {
        System.out.println("I cann't fly!");
    }
    
}