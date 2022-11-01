package services.implementations;

import exceptions.PersonNotFoundException;
import models.Person;
import services.PersonService;

import java.time.LocalDate;
import java.util.List;

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
    @Override
    public Person findPersonByFirstName(String firstName) throws PersonNotFoundException {
        Person resultPerson = null;


        //Search a person with a given firstname from the random list
        for (Person person : getRandomPersonList()) {
            if(person.getFirstName().equals(firstName)) {
                resultPerson = person;
                break;
            }
        }

        //If the person is not found then throw an exception
        if (resultPerson == null) {
            throw new PersonNotFoundException(firstName);
        }
        return resultPerson;
    }
    // PRIVATE METHODS //
    private List<Person>getRandomPersonList() {
        Person person1 = new Person();
        person1.setFirstName("Martin");
        person1.setLastName("XYZ");
        person1.setAge(44);

        Person person2 = new Person();
        person2.setFirstName("Julia");
        person2.setLastName("XYZ");
        person2.setAge(44);

        Person person3 = new Person();
        person3.setFirstName("Marko");
        person3.setLastName("XYZ");
        person3.setAge(4);

        Person person4 = new Person();
        person4.setFirstName("Elena");
        person4.setLastName("XYZ");
        person4.setAge(14);

        return List.of(person1,person2,person3,person4);
    }
}
