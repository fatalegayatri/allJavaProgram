import java.util.Scanner;

public class SearchAarry {
    public static void main(String[] args) {

        System.out.println("Enter size of   array");
        Scanner sr = new Scanner(System.in);

        int size = sr.nextInt();
        int num[] = new int[size];
        System.out.println("Enter elemnt in array");
        for (int i = 0; i < num.length; i++) {
            Scanner sc = new Scanner(System.in);

            num[i] = sc.nextInt();
        }
        System.out.println("enter elemnt to search");
        int x;
        Scanner ss = new Scanner(System.in);
        x = ss.nextInt();
        for (int i = 0; i < num.length; i++) {
            if (num[i] == x) {
                System.out.println(" element found at " + num[i]);

            }
        }
    }
}
