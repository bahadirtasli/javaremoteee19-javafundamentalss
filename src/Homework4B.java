/**
 *
 * Examples
 *
 * @author bahadir tasli
 */
public class Homework4B {
    public static void main(String[] args) {

        int[] b = {1, 7, 3, 10, 9};
        int total = 0;
        for(int x : b) {
            total += x; // total = total + x
        }
        System.out.println("total is "+ total);

        int avarage = 0;
        if(b.length > 0) {
            avarage = total / b.length;
            System.out.println("avarage is " + avarage);
        }

        //////////////////////////////////////////////////////////////////////

        int []a = {1, 7, 3, 10, 9};
        for(int i=0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }

}
