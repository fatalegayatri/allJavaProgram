
//Q3. Tiling problem

public class PlaceTile {

    public static int placeTile(int n, int m) {

        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        int verticle = placeTile(n - m, m);
        int horzontal = placeTile(n - 1, m);
        return verticle + horzontal;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTile(n, m));
    }
}
