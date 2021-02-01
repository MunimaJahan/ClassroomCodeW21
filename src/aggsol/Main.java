package aggsol;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("Jenny", 12345);
        Student s2 = new Student("Mike", 54321);
        Student s3 = new Student("Aaron", 44444);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        Lab l1 = new Lab(1502, 501);
        Lab l2 = new Lab(1502, 502);
        Lab l3 = new Lab(2511, 501);
        l1.addStudent(s1);
        l1.addStudent(s2);
        l2.addStudent(s3);
        l3.addStudent(s1);
        l3.addStudent(s2);
        l3.addStudent(s3);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
