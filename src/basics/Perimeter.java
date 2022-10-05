//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package basics;

import java.util.Scanner;

public class Perimeter {
    public Perimeter() {
    }

    public static void main(String[] args) {
        float pi = 3.14F;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        float radius = scanner.nextFloat();
        float area = 3.14F * radius * radius;
        float perimeter = 6.28F * radius;
        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);
    }
}
