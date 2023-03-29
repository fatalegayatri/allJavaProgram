
import java.util.*;

public class Gcd {
    public static void main(String[] args) {
        System.out.println("Enter two number ");
        int a, b, res = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {

                b = b - a;
            }
        }
        System.out.println("Gcd = " + a);
    }

}
