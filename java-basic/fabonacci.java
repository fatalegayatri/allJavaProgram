import java.util.*;

public class fabonacci {
    public static void main(String args[]) {
        System.out.println("Enter number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0, second = 1, next;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            next = first + second;
            first = second;
            second = next;
        }
    }
}
