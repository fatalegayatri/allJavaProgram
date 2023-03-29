package Recursion;

public class PowerLog {
    public static int PowerLog1(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return PowerLog1(x, n / 2) * PowerLog1(x, n / 2);
        } else {
            return PowerLog1(x, n / 2) * PowerLog1(x, n / 2) * x;

        }

    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int result = PowerLog1(x, n);
        System.out.println(result);
    }
}
