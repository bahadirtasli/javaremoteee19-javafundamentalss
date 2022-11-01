package exceptions;

/**
 * Exception to handle if the person is not found
 *
 * @author bahadir tasli
 */

public class PersonNotFoundException extends Exception {
    public PersonNotFoundException(String name){
        super(String.format("The person (%s) is not found", name));
    }

    public PersonNotFoundException(int age) {
        super(String.format("The person (%s) is not found", age));
    }
}
