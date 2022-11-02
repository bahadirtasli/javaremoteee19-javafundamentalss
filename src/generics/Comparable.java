package generics;

/**
 * Generic comparable interface
 *
 * @author bahadir tasli
 */

public interface Comparable<T> {
    /**
     * To compare two objects field and return then better object
     * @param item Generic
     * @return true or false
     */
    boolean isBetter(T item);

}
