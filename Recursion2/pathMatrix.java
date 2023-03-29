
public class pathMatrix {
    public static int pathCount(int i, int j, int n, int m) {

        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int rightMove = pathCount(i + 1, j, n, m);
        int downMove = pathCount(i, j + 1, n, m);
        return rightMove + downMove;

    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int count = pathCount(0, 0, n, m);
        System.out.println(count);
    }
}
