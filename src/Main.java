import base.Person;
import uni.*;

public class Main {
    public static void main(String[] args) {
        Major major1 = new Major("AP", 100);
        Major major2 = new Major("TA", 100);

        Person person1 = new Person("Leila", "01");
        Person person2 = new Person("Faegheh", "02");
        Person person3 = new Person("Nastaran", "03");
        Person person4 = new Person("Gatii", "04");
        Person person5 = new Person("YoosefiMehr", "05");

        Student student1 = new Student(1,403, major1.id);
        Student student2 = new Student(2,403, major1.id);
        Student student3 = new Student(3,403, major2.id);

        System.out.println(person1.name + " " + student1.id);
        System.out.println(person2.name + " " + student2.id);
        System.out.println(person3.name + " " + student3.id);

        Professor professor1 = new Professor(4, major1.id);
        Professor professor2 = new Professor(5, major2.id);

        System.out.println(person4.name + " " + professor2.id);
        System.out.println(person5.name + " " + professor2.id);

        Course course1 = new Course("Java", 3);
        Course course2 = new Course("Python", 3);
        Course course3 = new Course("PHP", 3);

        PeresentedCourse Java = new PeresentedCourse(course1.id, professor1.id, 65);
        PeresentedCourse Python = new PeresentedCourse(course2.id, professor1.id, 65);
        PeresentedCourse PHP = new PeresentedCourse(course3.id, professor2.id, 60);

        Java.addStudent(1);
        Java.addStudent(2);
        Python.addStudent(1);
        Python.addStudent(2);
        Python.addStudent(3);
        PHP.addStudent(3);

        Transcript transcript1 = new Transcript(student1.id);
        Transcript transcript2 = new Transcript(student2.id);
        Transcript transcript3 = new Transcript(student3.id);

        transcript1.setGrade(Java.id, 14);
        transcript1.setGrade(Python.id, 18);
        transcript2.setGrade(Java.id, 17);
        transcript2.setGrade(Python.id, 18);
        transcript3.setGrade(Python.id, 16);
        transcript3.setGrade(PHP.id, 18);

        System.out.print(person1.name + " :");
        transcript1.printTranscript();
        System.out.print(person2.name + " :");
        transcript2.printTranscript();
        System.out.print(person3.name + " :");
        transcript3.printTranscript();
    }
}