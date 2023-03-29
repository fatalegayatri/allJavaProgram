public class QuickSort {
    public static int pivot(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (j < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void Quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = pivot(arr, low, high);

            Quicksort(arr, low, pivot - 1);
            Quicksort(arr, pivot + 1, low);

        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 1, 3, 7, 2 };
        Quicksort(arr, 0, arr.length - 1);

    }
}
