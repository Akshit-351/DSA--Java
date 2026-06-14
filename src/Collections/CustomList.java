package Collections;

import java.util.ArrayList;

class Student{
    String name;
    int id;
    String course;

    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", course='" + course + '\'' +
                '}';
    }
}
public class CustomList {
    public static void main(String[] args) {
        Student s1 = new Student("Akshit", 2, "Btech");
        Student s2 = new Student("Akki", 5, "BBa");

        Student s3 = new Student("Akshay", 4, "pharma");
        ArrayList<Student> studentlist = new ArrayList<>();
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        System.out.println(studentlist);


    }

    }
