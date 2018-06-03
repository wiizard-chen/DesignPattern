package StrategyPattern;

// 普通飞行
public class FlyWithWing implements FlyBehavior {
    public void fly() {
        System.out.println("fly with wings!");
    }
}
