
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

    int calculateMonthsToBirthday() {
        int monthsLeft = 12 - month;
            return monthsLeft;
    }

}

public class Methods2 {
    public static void main(String[] args) {

        Methods name= new Methods();
        name.animal = "Cat";
        name.value = 9;
        // name.run();
        name.month = 8;
        int months = name.calculateMonthsToBirthday();

        System.out.println("Months until Birthday " + months);
    }
}