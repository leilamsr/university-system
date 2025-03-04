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
        this.numberOfStudents = 0;
        majorlist.add(this);
    }
    public static Major findById(int id){
        for(Major major : majorlist){
            if(major.id == id){
                return major;
            }
        }
        return null;
    }
    public void addStudent() {
        if(numberOfStudents < capacity){
            numberOfStudents++;
        }
        else {
            System.out.println("خطا! ظرفیت به حداکثر تعداد رسیده است.");
        }
    }
}
