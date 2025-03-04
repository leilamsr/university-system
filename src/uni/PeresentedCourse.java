package uni;

import java.util.ArrayList;

public class PeresentedCourse {
    public int id;
    public static ArrayList<PeresentedCourse> peresentedCourselist = new ArrayList<>();
    public int CourseID;
    public int professorID;
    public int capacity;
    public ArrayList<Integer> studentIds = new ArrayList<>();

    public PeresentedCourse(int CourseID, int professorID, int maxCapacity) {}
    public static PeresentedCourse findById(int id) { return null;}
    public void addStudent(int studentID) {}
}
