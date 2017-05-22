package entity;
public abstract class Duck {
   QuackBehavior quackBehavior;
   FlyBehavior flyBehavior;
   public void swim(){
   }
   pubilc viod display(){
   }
   public void performQuack() {
      quackBehavior.quack();
   }
   public void performFly() {
	   flyBehavior.fly();
	   }
  
   public void setQuackBehavior(QuackBehavior behavior) {
      this.quackBehavior = behavior;
   }
   public void setFlyBehavior(FlyBehavior behavior){
	   this.flyBehavior = behavior;
   }
