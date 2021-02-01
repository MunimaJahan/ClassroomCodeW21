package comsol;


public class Main {

    public static void main(String[] args) {

        University u = new University("MRU");

        u.addDepartment("Computing", 100);
        u.addDepartment("Anthropology", 50);

        System.out.println(u.getName());

        for (Department d : u.getDepartments()) {
            System.out.println(d.getName() + " " + d.getSize());
        }

    }

}