package base;
import java.util.ArrayList;

public class Person {
    public int id;
    public static ArrayList<Person> Personlist = new ArrayList<>();
    public String name;
    public String nationalID;

    public Person(String name, String nationlID) {
        this.id = id;
        this.name = name;
        this.nationalID = nationlID;
        Personlist.add(this);
    }

    public static Person findByID (int id) {
        for(Person person : Personlist) {
            if(person.id == id) {
                return person;
            }
        }
        return null;
    }
}