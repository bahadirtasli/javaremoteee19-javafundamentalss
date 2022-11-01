package services;

import exceptions.PersonNotFoundException;
import models.Person;
/**
 * PersonService interface to handle Person related operations
 *
 * @author bahadir tasli
 */
public interface PersonService {

    //Static field is allowed but not the normal field

    static final int AVERAGE_AGE = 20;

    /**
     * To get the birth year of the Person
     * @param age Age of the person
     * @return Birth year
     */
    int getPersonBirthYear(int age);

    /**
     *
     * @param person
     * @return
     */
    String getPersonFullName(Person person);

    //static method is allowed

    Person findPersonByFirstName(String firstName) throws PersonNotFoundException;

    /**
     * To find a person by firstname
     *
     * @return Person
     */

    static int getAverageAge() {
        return AVERAGE_AGE;
    }


}
