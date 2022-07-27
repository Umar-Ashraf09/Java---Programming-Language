
public class Interface2_Computer implements Interface4_Information {
    
    private int serialNumber = 8035;

    public void start() {

        System.out.println("Computer started!");
    }

    public void displayInterface4_Information() {

        System.out.println("Computer serial number is: " + serialNumber);

    }
}
