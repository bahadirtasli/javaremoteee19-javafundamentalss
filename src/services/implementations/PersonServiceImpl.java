package services.implementations;

import models.Person;
import services.PersonService;

import java.time.LocalDate;

/**
 * Implementation of person service
 *
 * @author bahadir tasli
 */

public class PersonServiceImpl implements PersonService {
    @Override
    public int getPersonBirthYear(int age) {
        return LocalDate.now().getYear() - age;
    }

    @Override
    public String getPersonFullName(Person person) {
        return person.getFirstName() + " " + person.getLastName();
    }

}
