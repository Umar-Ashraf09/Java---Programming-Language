
public class Interface1 {
    
    public static void main(String[] args) {
        
        Interface2_Computer computer1 = new Interface2_Computer();
        computer1.start();

        Interface3_Vehicle vehicle1 = new Interface3_Vehicle("Car");
        vehicle1.drive();

        Interface4_Information info = new Interface2_Computer();
        info.displayInterface4_Information();

        Interface4_Information info1 = vehicle1;
        info1.displayInterface4_Information();

        System.out.println();

        showInformation(computer1);
        showInformation(vehicle1);

    }

    private static void showInformation(Interface4_Information info) {

        info.displayInterface4_Information();

    }
}
