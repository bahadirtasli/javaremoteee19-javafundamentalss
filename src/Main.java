import models.Person;
import services.PersonService;
import services.implementations.PersonServiceImpl;

public class Main {
    public static void main(String[] args) {
      //INTERFACE
        Person person = new Person();
        person.setFirstName("Bahadir");
        person.setLastName("Tasli");
        person.setAge(10);

        //Left side should be interface name and Right side should be interface's implementation class name
        PersonService personService = new PersonServiceImpl();

        System.out.println("Person's birth year : " + personService.getPersonBirthYear(person.getAge()));
        System.out.println("Person's full name : " + personService.getPersonFullName(person));

        System.out.println("Person's last name : " + person.getLastName());
    }
}