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
        this.id = id;
        this.personID = personID;
        this.enteranceYear = enteranceYear;
        this.majorID = majorID;
    }
    public static Student findById(int id) {
        for(Student student : studentList) {
            if(student.id == id) {
                return student;
            }
        }
        return null;
    }
    public void setStudentCode() {
        int count = 0;
        for(Student student : studentList) {
            if(student.majorID == this.majorID){
                count++;
            }
        }
        this.studentID = String.format("%d%02d%03d", this.enteranceYear, this.majorID, count + 1);
    }
}
