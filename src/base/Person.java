package base;
import java.util.ArrayList;

public class Person {
    public int id;
    public static ArrayList<Person> Personlist = new ArrayList<>();
    public String name;
    public String nationalID;

    public Person(String name, String nationlID) {
        this.name = name;
        this.nationalID = nationlID;
    }

    public static Person findByID (int id) {
        return null;
    }
}