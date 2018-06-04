package DecoratorPattern;

public class CoCaBeverage implements Beverage {

    @Override
    public double cost() {
        return  3.00;
    }

    @Override
    public String getDescription() {
        return  "Coca Beverage \n";
    }
}
