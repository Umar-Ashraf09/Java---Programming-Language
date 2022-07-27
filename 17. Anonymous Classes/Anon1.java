
class Computer {

    public void shutDown() {

        System.out.println("Computer is shutting down.");

    }

}

interface Phone {
    public void call();
}

public class Anon1 {

    public static void main(String[] args) {

        Computer computer1 = new Computer() {
        
        @Override
        public void shutDown() {

            System.out.println("Windows is shutting down.");

        }

        };
        computer1.shutDown();

        Phone phone1 = new Phone() {

            public void call() {
                System.out.println("Calling...");
            }

        };

        phone1.call();
    }

}