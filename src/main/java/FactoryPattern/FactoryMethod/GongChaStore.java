package FactoryPattern.FactoryMethod;

public class GongChaStore extends MilkyTeaStore {
    public void createPizza(String type) {
        switch (type) {
            case "BlackTea":
                this.milkyTea = new MilkyBlackTea();
                break;
            case "GreenTea":
                this.milkyTea = new MilkyGreenTea();
                break;
            default:
                this.milkyTea = new MilkyBlackTea();
                break;
        }
    }
}
