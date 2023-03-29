public class RhombusPattern {

    public static void main(String agrs[]) {
        int n = 5;
        int l = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");

            }
            for (int j = 1; j <= 5; j++) {

                System.out.print("*");

            }

            System.out.println();
        }

    }
}
// out put
// *****
// *****
// *****
// *****
// *****