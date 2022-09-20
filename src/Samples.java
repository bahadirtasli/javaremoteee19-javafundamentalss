/**
 *
 * Examples
 *
 * @author bahadir tasli
 */
public class Samples {

    public static void main(String[] args) {
        String f = "fizz";
        String b = "buzz";
        String fb = "fizzbuzz";
        int x = 0;
        for (x = 1; x <= 50; x++){
            if ((x % 3 == 0) && (x % 5 == 0)) {
                System.out.println(fb);
            } else if(x % 3 == 0) {
                System.out.println(f);
            } else if(x % 5 == 0) {
                System.out.println(b);
            } else {
            }
        }

            int i;

            for (i = 0; i<=20; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + "is even number");
                } else {
                    System.out.println(i + "is odd number");
                }
            }
            for(i = 0; i <= 20; i++) {
                System.out.println(i + "is" + (i % 2 == 0 ? "even" : "odd") + "number"); // i is even/odd number
            }

            // Leap year
        int year = 2022;

            if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a leap year ");
            } else {
                System.out.println(year + " is not a leap year ");
            }

            // solution 2
        System.out.println(year + " is " + (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? " " : "not") + " a leap year") ;

            // solution 3
        if ( year % 4 == 0) {
            System.out.println("This is leap year");
        } else {
            System.out.println("not leap year");
        }


        // FIZZBUZZ
        //Solution 1

        int j = 10;
        if (j % 3 == 0 && j % 5 == 0) {
            System.out.println("FIZZBUZZ");
        } else if(j % 3 == 0) {
            System.out.println("FIZZ");
        }else if (j % 5 == 0) {
            System.out.println("BUZZ");
        }

        //Solution 2
        //housework3 : one line solution for FIZZBUZZ

        System.out.println(((j % 3 == 0) && ((j % 5) == 0)) ? "FIZZBUZZ" : (j % 3 == 0) ? "FIZZ" : (j % 5 == 0) ? "BUZZ" : "");

    }
}
