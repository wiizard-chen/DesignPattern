package DecoratorPattern;

public class OrangeJuice implements Beverage {
    @Override
    public double cost() {
        return 5.00;
    }

    @Override
    public String getDescription() {
        return "Orange Juice";
    }
}
