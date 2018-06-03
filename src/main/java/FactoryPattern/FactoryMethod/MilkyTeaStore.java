package FactoryPattern.FactoryMethod;

public abstract class MilkyTeaStore {
    MilkyTea milkyTea;

    public MilkyTea orderMilkyTea(String type) {
        createPizza(type);
        milkyTea.addTea();
        milkyTea.addMilk();
        milkyTea.pack();
        return milkyTea;
    }

    public abstract void createPizza(String type);
}
