package objects;

import persons.Person;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<Person> persons;
    public Table() {
        persons = new ArrayList<Person>();
    }
    public void addPerson(Person person) {
        persons.add(person);
    }
    public void removePerson(Person person) {
        System.out.println(person+" вылез из-под стола");
        persons.remove(person);
    }
}
