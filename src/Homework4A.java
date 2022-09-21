/**
 *
 * Examples
 *
 * @author bahadir tasli
 */
public class Homework4A {
    public static void main(String[] args) {
        int[] b = {9, 27, 40, 20, 839, 11000};
        int result = b [0]; // 9

        for (int x : b) {
            if (x > result) {
                result = x;
            }

        }
        System.out.println(result);

        int result2 = b [0] ;
        for (int x : b) {
            if(x <= result2) {
                result2 = x;

                System.out.println(result2);
            }
        }
    }

}
