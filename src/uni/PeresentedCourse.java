package uni;

import java.util.ArrayList;

public class PeresentedCourse {
    public int id;
    public static ArrayList<PeresentedCourse> peresentedCourselist = new ArrayList<>();
    public int CourseID;
    public int professorID;
    public int capacity;
    public ArrayList<Integer> studentIds = new ArrayList<>();

    public PeresentedCourse(int CourseID, int professorID, int maxCapacity) {
        this.CourseID = CourseID;
        this.professorID = professorID;
        this.capacity = maxCapacity;
        PeresentedCourse.peresentedCourselist.add(this);
        this.id = peresentedCourselist.size();
    }
    public static PeresentedCourse findById(int id) {
        for (PeresentedCourse p : peresentedCourselist) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }
    public void addStudent(int studentID) {
        if(studentID < capacity){
            studentIds.add(studentID);
        }
        else {
            System.out.println("خطا! ظرفیت به حداکثر تعداد رسیده است.");
        }
    }
}
