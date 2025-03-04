package uni;

import java.util.ArrayList;

public class Course {
    public int id;
    public static ArrayList<Course> courselist = new ArrayList<>();
    public String title;
    public int units;

    public Course(String title, int units) {}
    public static Course findById(int id) {
        return null;
    }
}
