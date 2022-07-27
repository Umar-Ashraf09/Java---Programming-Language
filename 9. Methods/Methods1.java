
class Methods {

    String animal;
    int value;
    int month;

    void run() {
        
        System.out.println("Running");
        for(int i=0; i<4; i++) {
            System.out.println("My " + animal + " is " + value + " years old.");
        }
    }

    void calculateMonthsToBirthday() {
        int monthsLeft = 12 - month;
        System.out.println(monthsLeft);
    }
}

public class Methods1 {
    public static void main(String[] args) {

        Methods name= new Methods();
        name.animal = "Cat";
        name.value = 9;
        // name.run();
        name.month = 8;
        name.calculateMonthsToBirthday();
    }
}