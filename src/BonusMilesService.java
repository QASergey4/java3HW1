public class BonusMilesService {
    private int rublesPerMiles = 20;

    public int calculate(int thicketPrice) {
        return thicketPrice / rublesPerMiles;
    }
}
