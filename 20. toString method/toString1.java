
class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {

        this.id = id;
        this.name = name;

    }

    public String toString() {

        return("Id: " + id + " - " + "full name: " + name);

    }

}

public class toString1 {

    public static void main(String[] args) {

        Employee employee1 = new Employee(101, "Harper Smith");
        Employee employee2 = new Employee(201, "Eveline Miller");

        System.out.println(employee1);
        System.out.println(employee2);

    }

}