import DecoratorPattern.Beverage;
import DecoratorPattern.CoCaBeverage;
import DecoratorPattern.Ice;
import DecoratorPattern.PackageBeverage;

public class TestMain {
    public static void main(String[] args) {
        Beverage coca = new CoCaBeverage();
        Beverage iceDecorator = new Ice(coca);
        Beverage packDecorator = new PackageBeverage(iceDecorator);
        System.out.println(packDecorator.cost());
        System.out.println(packDecorator.getDescription());
    }
}
