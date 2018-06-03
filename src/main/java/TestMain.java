import AdapterPattern.RoundHole;
import AdapterPattern.RoundScrew;
import AdapterPattern.SquareScrew;
import AdapterPattern.SquareScrewAdapter;

public class TestMain {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundScrew roundScrew = new RoundScrew(5);
        if (hole.fits(roundScrew)) {
            System.out.println("RoundScrew r5 fits RoundHole r5");
        }

        SquareScrew smallSquareScrew = new SquareScrew(2);
        SquareScrew largeSquareScrew = new SquareScrew(20);
        SquareScrewAdapter smallSquareScrewAdapter = new SquareScrewAdapter(smallSquareScrew );
        SquareScrewAdapter largeSquareScrewAdapter = new SquareScrewAdapter(largeSquareScrew );
        if (hole.fits(smallSquareScrewAdapter)) {
            System.out.println("smallSquareScrew w5 fits RoundHole r5");
        }
        if (hole.fits(largeSquareScrewAdapter)) {
            System.out.println("largeSquareScrew w5 fits RoundHole r5");
        }
    }
}
