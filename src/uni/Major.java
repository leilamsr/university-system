package uni;

import java.util.ArrayList;

public class Major {
    public int id;
    public static ArrayList<Major> majorlist = new ArrayList<>();
    public String name;
    public final int capacity;
    public int numberOfStudents;

    public Major(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    public static Major findById(int id){
        return null;
    }
    public void addStudent() {}

}
