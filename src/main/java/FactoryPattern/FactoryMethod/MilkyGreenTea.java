package FactoryPattern.FactoryMethod;

public class MilkyGreenTea extends MilkyTea {
    public void addTea() {
        System.out.println("add green tea");
    }

    public void addMilk() {
        System.out.println("add yoghourt");
    }

    public void pack() {
        System.out.println("special pack");
    }
}
