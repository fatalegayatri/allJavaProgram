package Recursion;

public class fibbonnacci {

    public static void fibonnaci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibonnaci(b, c, n - 1);
    }

    public static void main(String[] args) {
        int a = 0, b = 1, n = 5;
        System.out.print(a + "  " + b + " ");
        fibonnaci(a, b, n - 2);
    }
}
