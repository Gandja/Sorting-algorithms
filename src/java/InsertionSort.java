import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 0, 19, 13, 456, 33, 22, 55, 6, 8};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = value;
        }
    }
}
