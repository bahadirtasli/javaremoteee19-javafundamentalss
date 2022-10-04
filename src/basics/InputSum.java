package basics;

import java.util.Scanner;

/**
 * To read two number from the user, add and print the result of sum
 *
 * @author bahadir tasli
 */
public class InputSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to Sum");

        System.out.println("Number 1 : ");
        int number1 = scanner.nextInt();

        System.out.println("Number 2 : ");
        int number2 = scanner.nextInt();

        int total;

        total = number1 +number2 ;
        System.out.println("Total = " + total);


    }
}
