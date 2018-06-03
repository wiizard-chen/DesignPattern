package AdapterPattern;

// 圆孔
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundScrew screw) {
        boolean result;
        result = this.getRadius() >= screw.getRadius();
        return result;
    }
}
