package exercises;
/**
 *
 * To find all pairs of elements in a array that sums to a specified number
 *
 * @author bahadir tasli
 */

public class Exercise1 {
    public static void main(String[] args) {
        int [] array = {1, 2, 7, 3, 10, 2, 9};
        int sum = 4;
        ArrayPairCalculator arrayPairCalculator = new ArrayPairCalculator();
        String result= arrayPairCalculator.findAllPairsOfSum(array,sum);

        System.out.println(result);

    }
}
