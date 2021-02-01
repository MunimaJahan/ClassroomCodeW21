package comsol;

import java.util.ArrayList;

public class University {

    private String name;
    private ArrayList<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(String name, int size) {
        departments.add(new Department(name, size));
    }
}