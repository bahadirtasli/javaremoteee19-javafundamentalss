//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public ReverseArray() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many array elements?");
        int arrLenght = scanner.nextInt();
        System.out.println("Enter array elements one after another");
        int[] arr = new int[arrLenght];
        int[] reverseArr = new int[arrLenght];

        int j;
        for(j = 0; j < arrLenght; ++j) {
            arr[j] = scanner.nextInt();
        }

        System.out.println("Input array is : " + Arrays.toString(arr));
        j = 0;

        for(int i = arrLenght - 1; i >= 0; --i) {
            reverseArr[j] = arr[i];
            ++j;
        }

        System.out.println("Reverse array is : " + Arrays.toString(reverseArr));
    }
}
