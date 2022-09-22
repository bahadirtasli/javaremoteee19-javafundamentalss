/**
 *
 * Examples
 *
 * @author bahadir tasli
 */
public class homework3 {
    public static void main(String[] args) {
        int j = 10;
        System.out.println(((j % 3 == 0) && ((j % 5) == 0)) ? "FIZZBUZZ" : (j % 3 == 0) ? "FIZZ" : (j % 5 == 0) ? "BUZZ" : "") ;
    }
}
