package FactoryPattern.FactoryMethod;

public class MilkyBlackTea extends MilkyTea {
    public void addTea() {
        System.out.println("add black tea");
    }

    public void addMilk() {
        System.out.println("add milk");
    }

    public void pack() {
        System.out.println("normal pack");
    }
}
