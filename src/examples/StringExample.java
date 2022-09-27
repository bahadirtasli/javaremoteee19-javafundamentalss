package examples;

/**
 * Example of String
 *
 * @author bahadir tasli
 */

public class StringExample {
    public static void main(String[] args) {
        String firstName = "Bahadir";
        String lastName = "Tasli";
        String fullName = firstName +  lastName; // Option 1
        System.out.println(fullName);

        fullName = firstName.concat(lastName); // Option 2
        System.out.println(fullName);

        String city = "Tallinn";

        String ageString = "My age is : " + 3 + ".I live in " + city + ".My name is : " + fullName;

        System.out.println(ageString);

        String ageStringFormatted = String.format("My age is : %d.I live in %s.My name is : %s", 3, city, fullName);
        System.out.println(ageStringFormatted);

        //Stringbuilder
        //automatically joins to the same variable

        StringBuilder str1 = new StringBuilder("Hello!");
        str1.append("world");
        StringBuilder str2 = str1.append("World");
        System.out.println(str2);
        System.out.println(str1);


        // need to assign to the variable additionally

        String var1 = "Red";
        var1 = var1.concat("Yellow").concat("Green");
        String var2 = "Blue";
        System.out.println(var1);
        System.out.println(var2);

        //Equality
        // ==  -> compare Memory reference and value
        //string.equals() -> compare only the value

        String s1 = "Sibul"; // Pool
        String s2 = "Sibul"; // Pool
        String s3 = new String("Sibul"); //Heap
        String s4 = new String("Sibul"); //Heap
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println( s4 == s3 );

        System.out.println(s1.equals(s3));





    }
}
