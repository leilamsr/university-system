package uni;

import java.util.ArrayList;

public class Student {
    public int id;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public int personID;
    public final int enteranceYear;
    public int majorID;
    public String studentID;

    public Student(int personID, int enteranceYear, int majorID) {
        this.personID = personID;
        this.enteranceYear = enteranceYear;
        this.majorID = majorID;
    }
    public static Student findById(int id) {
        return null;
    }
    public void setStudentCode() {}
}
