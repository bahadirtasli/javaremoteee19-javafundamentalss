package abstracts;

/**
 * An abstract Food class
 *
 * @author bahadir tasli
 */

public abstract class Food {
    private String color;

    public Food(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat(); // you can only define it here, but can not write the implementation here. The implementation will be in the extending class(es)

}
