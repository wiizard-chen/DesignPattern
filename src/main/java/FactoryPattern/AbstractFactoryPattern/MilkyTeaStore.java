package FactoryPattern.AbstractFactoryPattern;

public abstract class MilkyTeaStore {
    public MilkyTea orderMilkyTea(String type) {
        MilkyTea milkyTea = createPizza(type);
        milkyTea.prepare();
        return milkyTea;
    }

    public abstract MilkyTea createPizza(String type);
}
