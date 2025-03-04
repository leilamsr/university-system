package uni;

import java.util.HashMap;

public class Transcript {
    public int studentID;
    public HashMap<Integer,Double> transcript;

    public Transcript(int studentID){
        this.studentID = studentID;
        this.transcript = new HashMap<>();
    }
    public void setGrade(int presentedCourseID, double grade){
        this.transcript.put(presentedCourseID,grade);
    }
    public void printTranscript(){
        Student student = Student.findById(studentID);
        System.out.println("نام : " + student.personID + "شماره دانشجویی : " + student.studentID);
        for(int presentedcourseID : transcript.keySet()) {
            PeresentedCourse p = PeresentedCourse.findById(presentedcourseID);
            if (p != null) {
                Course course = Course.findById(p.CourseID);
                if (course != null) {
                    System.out.println("عنوان درس : " + course.title + "نمره : " + transcript.get(presentedcourseID));
                }
            }
        }
    }

    public Double getGPA(){
        double sumGrade = 0;
        int total = 0;

        for(int presentedcourseID : transcript.keySet()) {
            PeresentedCourse p = PeresentedCourse.findById(presentedcourseID);
            if(p != null) {
                Course course = Course.findById(p.CourseID);
                if(course != null) {
                    double grade = transcript.get(presentedcourseID);
                    int units = course.units;
                    sumGrade += grade * units;
                    total += units;
                }
            }
        }

        if(total == 0) {
            return 0.0;
        }

        return sumGrade / total;
    }

}
