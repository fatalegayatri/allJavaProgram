
import java.util.*;

public class Selection {

    public static void selection(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int size;
        Scanner ser = new Scanner(System.in);
        size = ser.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            Scanner sr = new Scanner(System.in);
            arr[i] = sr.nextInt();
        }
        selection(arr);
    }
}
