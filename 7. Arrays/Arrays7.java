
public class Arrays7 {
    public static void main(String[] args) {

        int[][] multiDimensionalArray = {{12, 49, 922}, {23, 56, 78, 12}, {12, 34, 56}};

        for(int array=0; array<multiDimensionalArray.length; array++) {
            for(int item=0; item<multiDimensionalArray[array].length; item++) {
                System.out.print(multiDimensionalArray[array][item] + "\t");
            }
            System.out.println();
        }
    }
}