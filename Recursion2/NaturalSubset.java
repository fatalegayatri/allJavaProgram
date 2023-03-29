
import java.util.*;

public class NaturalSubset {
    public static void subset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");

        }
        System.out.println();
    }

    public static void printSubset(int n, ArrayList<Integer> subset) {

        if (n == 0) {
            subset(subset);
            return;
        }
        // to add number in subset
        subset.add(n);
        printSubset(n - 1, subset);
        // not to add number in subset
        subset.remove(subset.size() - 1);
        printSubset(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList subset = new ArrayList<>();
        printSubset(n, subset);
    }
}
