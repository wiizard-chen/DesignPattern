package FactoryPattern.SimpleFactory;

public class ColorFactory {
    public static ColorBase getInstance(Color sign){
        ColorBase instance = null;
        switch (sign){
            case RED: instance = new RedColor(); break;
            case GREEN: instance = new GreenColor();break;
            default: instance = new RedColor(); break;
        }
        return  instance;
    }
}
