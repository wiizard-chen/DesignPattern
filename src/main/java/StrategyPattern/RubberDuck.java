package StrategyPattern;

//橡皮鸭的实现类
public class RubberDuck extends Duck{
    public RubberDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm rubber duck");
    }
}
