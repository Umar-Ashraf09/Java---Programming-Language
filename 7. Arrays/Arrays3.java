
public class Arrays3 {
    public static void main(String[] args) {

        int number = 10;

        int[] numbers = new int[5];

        System.out.println(numbers[0]);

        numbers[0] = 15;
        numbers[1] = 20;
        numbers[2] = 25;
        numbers[3] = 30;
        numbers[4] = 35;

        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}