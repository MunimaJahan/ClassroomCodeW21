package comsol;

public class Department {

    private String name;
    private int size;

    public Department(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
