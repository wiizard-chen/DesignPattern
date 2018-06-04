package DecoratorPattern;

public class Ice implements BeverageDecorator{
    private Beverage beverage;

    public Ice(Beverage beverage){
       this.beverage = beverage;
    }

    @Override
    public double cost() {
        return  1.00 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "Add Ice \n";
    }
}
