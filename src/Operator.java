/**
 * Examples for Java operators
 *
 * @author bahadirtasli
 */

public class Operator {

    public static void main(String[] args) {
        int i = 0;

        System.out.println(i);

        System.out.println(i++); //0 &increment here but not used)

        i++; // i+1 (incremented value plus another increment)

        System.out.println(i);

        //post-decrement
        int y = 0;
        System.out.println(y--);
        System.out.println(y);

        // pre -decrement
        int j = 10;
        System.out.println(j);
        System.out.println(--j);

        // brackets are the highest priority
        int x = i + (-j); // x = i - j; 2-9
        System.out.println(x);

        //binary operators
        //aritmatic operators
        int a = 4;
        int b = 20;
        int c= a + b;
        System.out.println(c);

        int d = a + c * b;
        System.out.println(d);

        float z = i * a + (c / b) - (-j) % x;
        /*
        1. z = 1 * a + (c / b) + j % x;
         */
        System.out.println(z);

        float divide = (float) 40 / 7; // Quotient value
        System.out.println(divide);

        float modulo = 40 % 7; // Reminder value
        System.out.println(modulo);

        // Comparison operators( ==, !=, >, <, >=, <_)
        boolean result = divide == modulo;
        System.out.println(result);

        boolean result2 = divide != modulo; // != means not equal
        System.out.println(result2);

        boolean lessCheck = divide < modulo; // 8 < 5
        System.out.println(lessCheck);

        boolean greaterCheck = divide > modulo; // 8 > 5
        System.out.println(greaterCheck);

        //8 >= 5 // true

        //8 >= 8 // true

        //less than or equals
        boolean lessEquals = divide <= modulo;
        System.out.println(lessEquals);

        // logical operators (&&, ||) - and , or
        /*
        true && false = false
        false && true = false
        false && false = false
        true && true = true
         */
        boolean andCheck = 8 < 9 && 10 > 4; // both of operation should be true for get true as a result. If one of operation's result is not true you will get false as a result.
        System.out.println(andCheck);

        /*
        true || false = false
        false || true = false
        false || false = false
        true || true = true
         */

        boolean orCheck = 8 < 9 || 1 > 4; // If one of operations result is true you will get tru as a result.
        System.out.println(orCheck);

        /*
        0=false
        1=true

        true ^ false = true
        false ^ true = true
        true ^ true = false
        false ^ false = true

         */

        float expo = 12 ^ 25; // 12 = 00001100, 25 = 000110001
        System.out.println(expo);

        //Assignment operators
        x = x + y; // both are same
        x += y;
        x /= y;
        x *= y;

        //ternary operators ( ?, : )
        String ternary = (x > y) ? "Cat" : "Dog";
        System.out.println(ternary);

        int ternaryCheck = (x > y) && (a >= b) ? 5 : 1;
        System.out.println(ternaryCheck);

        int check2 = !lessCheck ? 9 : 10;

        boolean checkNumber = 9 == 9.0; // int == float
        System.out.println(checkNumber);


    }
}
