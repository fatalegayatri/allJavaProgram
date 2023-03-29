import java.util.*;

public class Calcy {

    void cal() {
        int a, b, c;
        System.out.println(" Enter two number ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(
                " Enter operation do you want to perform\n 1 = Adition\n 2 = Subtraction\n3 = Multiplication\n4 = division");
        Scanner sr = new Scanner(System.in);
        c = sr.nextInt();
        switch (c) {
            case 1:
                System.out.println((a + b));

                break;
            case 2:
                System.out.println((a - b));

                break;
            case 3:
                System.out.println((a * b));

                break;
            case 4:
                System.out.println((a / b));

                break;

            default:
                System.out.println("enter valid operation\n");

                break;
        }
    }

    public static void main(String args[]) {
        Calcy obj = new Calcy();
        obj.cal();
    }
}
