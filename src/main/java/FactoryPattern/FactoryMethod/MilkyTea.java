package FactoryPattern.FactoryMethod;

public abstract class MilkyTea {
    // 添加茶包
    public abstract void addTea();

    // 添加牛奶
    public abstract void addMilk();

    // 包装奶茶
    public abstract void pack();
}
