//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package basics;

import java.util.Scanner;

public class InputSum {
    public InputSum() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to Sum");
        System.out.println("Number 1 : ");
        int number1 = scanner.nextInt();
        System.out.println("Number 2 : ");
        int number2 = scanner.nextInt();
        int total = number1 + number2;
        System.out.println("Total = " + total);
    }
}
