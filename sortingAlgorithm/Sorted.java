// package sortingAlgorithm;

public class Sorted {
    public static boolean isSorted(int idx, int arr[]) {

        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return isSorted(idx + 1, arr);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6 };
        boolean ans = isSorted(0, arr);
        System.out.println(ans);
    }
}
