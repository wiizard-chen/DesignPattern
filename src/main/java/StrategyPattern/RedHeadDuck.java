package StrategyPattern;

//红头鸭的实现类
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        this.flyBehavior = new FlyWithWing();
        this.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("head is red");
    }
}
