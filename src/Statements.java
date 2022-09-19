/**
 * Statement examples
 *
 * @author bahadir tasli
 */
public class Statements {
    public static void main(String[] args) {
        int i = 8;
        int y = 10;

        String name = "baha";
        if (name == "bahadir" || name != "tasli") {
            System.out.println("The name is correct");
        }

        if ((i < y && y > 0) || i == 8) {
            System.out.println("i is greater than y");
        }

        System.out.println("This is simple program");

        /*
        if(shirt size == M && shirt color == black) {
          //buy the shirt
        }
         */


        /*
        if(shirt size == M && shirt color == black) {
        //buy the shirt
        } else if(shirt size == M && shirt color == blue) {
        //buy the shirt
        { else }
        // buy the shirt from other shop
         */

        if (i > y) {
            System.out.println("i is greater than y");
        } else {
            System.out.println("y is greater than i");
        }


        if (i > y) {
            System.out.println("i is greater than y");
        } else if (i < 9) {
            System.out.println("i is lesser");
        } else {
            System.out.println("i is invalid");

        }

        /* SWITCH
        If we want to check one condition for multiple values.
         */
        int x = 10;
        int j = 6;
        int z = x + j;

        switch (z) {
            case 10:
                System.out.println("The value of z is 10");
            case 11:
                System.out.println("The value of z is 11");
                break;
            case 12:
                System.out.println("The value is 12");
            default:
                System.out.println("Default block executed!");
        }

        String color = "Red";

        switch (color) {
            case "Red":
                System.out.println("I'm Red");
                break;
            case "white":
                System.out.println("I'm white");
                break;
        }
        //WHILE
        int money = 0;

        while (money <= 5) {
            System.out.println("Doing job");
            money++;
        }

        // DO WHILE

        do {
            System.out.println("money =" + money);
            money += 10; // money +10
        } while (money < 100);

        //FOR
        int g = 0;
        for (g = 4; g <= 6; g++) {
            System.out.println("g value is" + g);

        }




    }
}

