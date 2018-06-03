package StrategyPattern;

public class GreenHeadDuck extends Duck {
    public void fly() {
        System.out.print("normal fly");
    }

    public void quack() {
        System.out.print("normal quack");
    }

    public void display() {
        System.out.print("head is green");
    }
}
