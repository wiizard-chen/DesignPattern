package StrategyPattern;

// 普通鸭叫
public class Quack implements QuackBehavior{
    public void quack() {
        System.out.println("normal quack!");
    }
}
