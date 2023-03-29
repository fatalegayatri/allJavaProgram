import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<Integer>();
        // To add element in list
        List.add(9);
        List.add(5);
        List.add(2);
        int list = List.get(2);
        // to get element of a list pass index of it;
        // System.out.println(list);
        // To set ele at perticular index;
        List.set(0, 4);
        System.out.println(List.size());

        // Collections.sort(List);
        System.out.println(List);
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int arr[] = new int[a];
        System.out.println(arr.length);

    }

}
