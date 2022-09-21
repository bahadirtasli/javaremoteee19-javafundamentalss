/**
 *  Examples of Arrays
 *
 * @author bahadir tasli
 */
public class Array {
    public static void main(String[] args) {

        //Single-dimensional array

        //infinite array
        //int array
        int a = 9;
        int[] b = {9, 27, 40, 20, 839, 11000}; //Can not add different values

        //String array
        String[] fruits = {"apple", "orange", "mango", " " , "banana", "434443"}; // sout describe the index(which mean
        System.out.println(fruits[0]);
        System.out.println(b[4]);
        System.out.println(fruits[3]); // Array index out of bound
        System.out.println(b.length); //return the number of values in the array
        System.out.println(b.length - 1); // returns array's last index


        /* defined array */
        int[] veggies = new int[5];

        veggies[3] = 65;
        veggies[4] = 45;

        System.out.println(veggies[1]);

        String[] veggie = new String[5453];

        veggie[3] = "Potato";
        veggie[4] = "Carrot";

        System.out.println(veggie[1]);

        String[] food = new String[] {"cake", "porridge", "rice"};

        int[] ageArray = new int[3];

        //processing array
        //conventional for-loop
        for(int i=0; i < fruits.length; i++) { // i = index of array
            System.out.println(fruits[i]);
        }

        //enchanced for-loop
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        //Find the largest element in the array
        //Brute-force method
        int result = b [0]; // 9

        for (int x : b) {
            if (x > result) {
                result = x;
            }

        }
        System.out.println(result);


        //Homework4
        //To find smallest element in the array (b)


    }
}
