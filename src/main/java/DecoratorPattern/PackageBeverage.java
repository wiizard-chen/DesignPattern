package DecoratorPattern;

public class PackageBeverage implements BeverageDecorator {
    private Beverage beverage;

    public PackageBeverage(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 1.00 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "Package!\n";
    }
}
