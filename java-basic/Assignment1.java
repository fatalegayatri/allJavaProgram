import java.util.*;

public class Assignment1 {

    public static void main(String[] args) {
        System.out.println(" Enter number");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is a power of two ");
        } else {
            System.out.println(n + " is a not  power of two ");

        }
    }

}
