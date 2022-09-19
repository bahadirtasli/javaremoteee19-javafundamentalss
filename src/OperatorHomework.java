/**
 * Homework
 *
 * @author bahadir tasli
 */

public class OperatorHomework {
    public static void main(String[] args) {

        int a = 9;
        int b = 11;
        double c = -0.125;
        int d = -3334;
        int e = 1112;
        int x = -2;
        int y = 1;
        double z = 1.25;
        double w = -6.75;

        //int k = 2;
        //System.out.println(-k);
        //System.out.println(-k);

        //double result3 = (w % z);
        //System.out.println(result3);

        //double result2 = (d % (--e));
        //System.out.println(result2); = - 1

        //float result4 = (float) ( (a + (-b)) * c / ((d % (--e)) - x) );
        //System.out.println(result4);

        //float result5 = (float) ( 0.125 - (y * (z % w ) ) ); // - 1,125
        //System.out.println(result5);


        double result = ((a + (-b)) * c / ((d % (--e)) - x)) - (y * (z % w));
        System.out.println(result);

        /*Steps
                                  ---PEMDAS---
        	parentheses, exponents, multiplication, division, addition, subtraction

        1.(-b) and (--e) ; java will start the process with these operations due to bracket's precedence.
        1.a( ( (a + -11) * c / ((d % 1111) - x) ) - (y * (z % w ) ) );

        2. (d % (--e) = - 1 ; (a + - b) & (d % 1111) & (z % w) has same brackets so according the pemdas the order of precedence should be like (d % 1111) - (z % w ) - (a + -b)
        2.a( ( (a + -10) * c / (-1 - x) ) - (y * (z % w ) ) );
        2.b( ( (a + -10) * c / (-1 - x) ) - (y * 1.25 ) ); I don't know why but java printing the first number in this operation as a result, if the first number lower than second number.
        ref : //double result3 = (w % z);
        //System.out.println(result3); 1.25
        2.c( ( -2 * c / (-1 - x) ) - (y * 1.25 ) );

        3. (1 -x) & (y*1,25) has brackets presedence, probably (1-x) operation will be done first.
        3.a( ( -2 * c / 1 ) - (y * 1.25 ) );
        3.b( ( -2 * c / 1 ) - 1.25 );

        4.Brackets precedence is continuing.Also according to pemdas the multiplication operation will be done first. So;
        4.a( ( 0,25 / 1) - 1,25);
        4.b( ( 0,25 / 1) - 1,25) =  -1,0

         */


        String XX = ((a + (-b)) * c / ((d % (--e)) - x) > (y * (z % w))) ? "White" : "Black";
        System.out.println(XX);


    }


}
