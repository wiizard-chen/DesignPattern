package FactoryPattern.AbstractFactoryPattern;

public abstract class MilkyTea {
    MilkyTeaMaterialFactory factory;

    Tea tea;

    Milk milk;

    String name;

    abstract void prepare();

    MilkyTea(MilkyTeaMaterialFactory factory) {
        this.factory = factory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
