package FactoryPattern.AbstractFactoryPattern;

public class MilkyBlackTea extends MilkyTea {
    @Override
    void prepare() {
        this.tea = factory.createTea();
        this.milk=factory.createMilk();
        this.tea.display();
        this.milk.display();
        System.out.println(this.name);
    }

    MilkyBlackTea(MilkyTeaMaterialFactory factory) {
        super(factory);
    }
}
