package FactoryPattern.AbstractFactoryPattern;

public class NormalBlackTeaFactory implements MilkyTeaMaterialFactory {

    @Override
    public Tea createTea() {
        return new BlackTea();
    }

    @Override
    public Milk createMilk() {
        return new PureMilk();
    }
}
