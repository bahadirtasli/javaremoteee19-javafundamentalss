package statements;

import java.util.Scanner;

public class SumOfNumbers {
    public SumOfNumbers() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to sum?");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.println("Enter numbers to sum : ");

        for(int i = 1; i <= n; ++i) {
            System.out.println("Number " + i + " : ");
            int input = scanner.nextInt();
            sum += input;
        }

        System.out.println("Sum: " + sum);
    }
}
