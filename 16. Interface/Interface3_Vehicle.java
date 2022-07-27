
public class Interface3_Vehicle implements Interface4_Information {

    private String type;

    public Interface3_Vehicle(String type) {
        this.type = type;
    }

    public void drive() {

        System.out.println("Driving the vehicle.");

    }

    public void displayInterface4_Information() {
        System.out.println("Vehicle type is: " + type);
    }
}