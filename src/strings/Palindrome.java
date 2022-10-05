//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package strings;

import java.util.Scanner;

public class Palindrome {
    public Palindrome() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = scanner.nextLine();
        StringBuilder reverseWord = new StringBuilder();

        for(int i = word.length() - 1; i >= 0; --i) {
            reverseWord.append(word.charAt(i));
        }

        if (word.equalsIgnoreCase(reverseWord.toString())) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }

    }
}
