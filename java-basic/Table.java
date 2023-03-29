import java.util.*;

public class Table {

    void table() {
        int a;
        System.out.println("Enter number ");
        Scanner sr = new Scanner(System.in);
        a = sr.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + a + " = " + (i * a));
            // System.out.print(a);

        }

    }

    public static void main(String args[]) {
        Table t1 = new Table();
        t1.table();
    }
}
