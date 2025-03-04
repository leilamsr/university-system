package uni;

import java.util.ArrayList;

public class Course {
    public int id;
    public static ArrayList<Course> courselist = new ArrayList<>();
    public String title;
    public int units;

    public Course(String title, int units) {
        this.title = title;
        this.units = units;
        Course.courselist.add(this);
        this.id = courselist.size();
    }
    public static Course findById(int id) {
        for(Course course : courselist) {
            if(course.id == id) {
                return course;
            }
        }
        return null;
    }
}
