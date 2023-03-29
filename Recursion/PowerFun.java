package Recursion;

public class PowerFun {
    public static int powOf(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        int powof = powOf(x, n - 1);
        int result = powof * x;
        return result;
    }

    public static void main(String[] args) {
        int x = 1, n = 0;
        int ans = powOf(x, n);
        System.out.println(ans);
    }
}
