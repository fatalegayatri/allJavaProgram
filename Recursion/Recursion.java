package Recursion;

public class Recursion {

    public static void main(String[] args) {
        int a = 1;
        res(a);
        // System.out.println(result);
    }

    public static void res(int a) {
        if (a == 6) {
            return;
        }
        System.out.println(a);
        res(a + 1);
    }

}
