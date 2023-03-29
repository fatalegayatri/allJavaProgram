
import java.util.*;

public class Main {
    public static void main(String args[]) {
        System.out.println("Enter radius of circle ");
        Scanner sc = new Scanner(System.in);
        double rd = sc.nextDouble();
        double PI = 3.14;

        double ans = PI * (rd * rd);
        System.out.println("Area of circle is ");
        System.out.println(ans);
    }
}
