package AdapterPattern;

public class SquareScrewAdapter extends RoundScrew {
    private SquareScrew squareScrew;

    public SquareScrewAdapter(SquareScrew squareScrew) {
        this.squareScrew = squareScrew;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((squareScrew.getWidth() / 2), 2) * 2));
        return result;
    }
}
