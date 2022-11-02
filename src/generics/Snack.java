package generics;

/**
 * Implementation of Comparable Interface
 *
 * @author bahadir tasli
 */
public class Snack implements Comparable<Snack>{
    private final int tasteRating;

    public Snack(int tasteRating) {
        this.tasteRating = tasteRating;
    }

    @Override
    public boolean isBetter(Snack item) {
        return this.tasteRating > item.tasteRating;
    }
}
