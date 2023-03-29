public class MergeSort {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int newarr[] = new int[ei - si + 1];
        int idx = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx <= mid && idx2 <= ei) {
            if (arr[idx] <= arr[idx2]) {
                newarr[x++] = arr[idx++];

            } else {
                newarr[x++] = arr[idx2++];

            }
        }
        while (idx <= mid) {
            newarr[x++] = arr[idx++];

        }
        while (idx2 <= ei) {
            newarr[x++] = arr[idx2++];

        }
        for (int i = 0, j = si; i < newarr.length; i++, j++) {
            arr[j] = newarr[i];
        }
    }

    public static void divider(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divider(arr, si, mid);
        divider(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 6, 7, 1, 3 };
        int n = arr.length;
        divider(arr, 0, n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
