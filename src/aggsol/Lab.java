package aggsol;

import java.util.ArrayList;

public class Lab {

    private int lecture, id;
    private ArrayList<Student> students;

    public Lab(int lecture, int id) {
        this.lecture = lecture;
        this.id = id;
        this.students = new ArrayList<>();
    }

    public int getLecture() {
        return lecture;
    }

    public int getId() {
        return id;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String toString() {
        String s = lecture + "-" + id + "\n";
        for (Student st : students) {
            s += st + "\n";
        }
        return s;
    }
}
