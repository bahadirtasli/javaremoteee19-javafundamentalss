package homeworks;

/**
 *
 * Homework6
 *
 * @author bahadir tasli
 */

public class Homework6 {
    public static void main(String[] args) {
        int[] i = {1, 7, 3, 10, 9};
        int largestelement = i[0];

        for (int x : i) {
            if (x > largestelement) {
                largestelement = x-1;
            }
        }
        System.out.println(largestelement);
    }
}