
// Friends pairing problem

public class PairRecursion {
    public static int PairCount(int n) {
        if (n <= 1) {
            return 1;
        }
        return PairCount(n - 1) + PairCount(n - 2) * (n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(PairCount(n));
    }
}
