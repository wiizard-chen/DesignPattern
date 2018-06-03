package FactoryPattern.AbstractFactoryPattern;

public class GongChaStore extends MilkyTeaStore {
    @Override
    public MilkyTea createPizza(String type) {
        MilkyTea milkyTea = null;
        MilkyTeaMaterialFactory milkyTeaMaterialFactory = new NormalBlackTeaFactory();
        milkyTea = new MilkyBlackTea(milkyTeaMaterialFactory);
        milkyTea.setName(type);
        return milkyTea;
    }
}
