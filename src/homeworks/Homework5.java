package homeworks;

/**
 * homework5
 *
 * @author bahadir tasli
 */

public class Homework5 {
    public static void main(String[] args) {
        int[] i = {1, 7, 3, 10, 9};

        for (int x = 0; x < i.length; x++) {
            if (i[x] % 2 != 0) {
                System.out.println(i[x]);
            }
        }
        int z = 0;
        for (int y = 0; y < i.length; y++) {
            if (i[y] % 2 == 0) {
                z++;
            }
        }
        System.out.println("Number of even numbers = " + z);
        System.out.println("Number of odd numbers = " + (i.length - z));

        int [] m = {1, 7, 3, 7, 10, 9};
        for (int k = 0; k < i.length; k++) {
            for (int l = k + 1; l < i.length; l++) {
                if (m[k] == m[l]) {
                    System.out.println(m[l]);
                }

            }
        }
    }
}