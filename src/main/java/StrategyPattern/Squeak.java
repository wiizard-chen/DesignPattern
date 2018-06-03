package StrategyPattern;

//橡皮鸭子叫
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("rubber quack!");
    }
}
