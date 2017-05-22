package entity;
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyNoWay();
    }
    public void display() {
        System.out.println("I cann't fly!");
    }
    
}