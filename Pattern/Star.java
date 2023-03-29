/**
 * Star
 */
public class Star {

    public static void main(String agrs[]) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

    }
}