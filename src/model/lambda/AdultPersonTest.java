package model.lambda;

import model.Person;

import java.util.function.Predicate;

public class AdultPersonTest implements Predicate<Person> {
    @Override
    public boolean test(Person person) {
        return person.getAge() >= 18;
    }
}
