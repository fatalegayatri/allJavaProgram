import java.util.*;

public class Sample {
    /**
     * InnerSample
     */
    public static class InnerSample {

        public static void print() {
            int arr[][] = new int[4][3];
            System.out.println("enter element in matrix");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 3; j++) {

                    Scanner sr = new Scanner(System.in);
                    arr[i][j] = sr.nextInt();
                }

            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 3; j++) {

                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("\n ");

            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Hello world");
        InnerSample.print();

    }
}
