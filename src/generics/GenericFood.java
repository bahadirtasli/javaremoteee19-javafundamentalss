package generics;

/**
 * Generic food class
 *
 * @author bahadir tasli
 */

public class GenericFood<T> {
    private T item; //private Fruit item;

    public GenericFood(T name) {
        this.item = name;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
