package objects;

import persons.Person;

import java.util.ArrayList;
import java.util.List;

public class Window {
    private List<Person> persons;
    private Windowsill windowsill;

    public Window() {
        windowsill = new Windowsill();
        persons = new ArrayList<Person>();
    }
    public void addPerson(Person person) {
        System.out.println(person + " оказался у окна");
        persons.add(person);
    }


    public Windowsill getWindowsill() {
        return windowsill;
    }
    public void removePerson(Person person) {
        persons.remove(person);
    }
    @Override
    public String toString() {
        return "окно";
    }
}
