package Recursion;

public class Naturaul {
    public static void main(String[] args) {
        int a = 5;
        // int sum = 1;
        int rs = Sum(a);

        System.out.println(rs);
    }

    public static int Sum(int a) {
        if (a == 1 || a == 0) {

            return 1;
        }

        int fact = Sum(a - 1);
        int fact1 = a * fact;
        return fact1;

    }
}
