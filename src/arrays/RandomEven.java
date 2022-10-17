package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Write a program that does the following(the code should be written in separate methods):
 *
 * Generated an array with 10 elements random between 0 and 99.(See Random class in Java).
 * Display the generated array.
 * Display only the odd numbers.
 * Display only the even numbers.
 */

public class RandomEven {
    public static void main(String[] args) {
        final int min = 0;
        final int max = 99;
        final int arrayLimit=10;

        int[] array = new int[arrayLimit];

        for (int i = 0; i < arrayLimit;i++) {

            array[i] = getRandomNumber(min,max);
        }

        System.out.println("Random array");
        displayArray(array);

        displayOddArray(array);
        displayEvenArray(array);

    }


    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;


    }

    private static void displayArray(int[] inputArray) {
        System.out.println(Arrays.toString(inputArray));

    }

    private static void displayOddArray(int [] inputArray) {
        List<Integer> oddArrayList = new ArrayList<>();
        for (int number : inputArray) {
            if (number %2 != 0) {
                oddArrayList.add(number);
            }
        }
        System.out.println("Odd number of the array : ");

        displayArray(convertListToArray(oddArrayList));
    }

    private static void displayEvenArray(int [] inputArray) {
        List<Integer> EvenArrayList = new ArrayList<>();
        for (int number : inputArray) {
            if (number %2 == 0) {
                EvenArrayList.add(number);
            }
        }
        System.out.println("Even number of the array : ");

        displayArray(convertListToArray(EvenArrayList));
    }

    private static int[] convertListToArray (List<Integer> intList) {
        int [] result = new int[intList.size()] ;
        for (int i = 0; i < intList.size(); i++) {
            result[i] = intList.get(i);
        }
        return result;

    }
}
