/**
 * This is one of sorting algorithms and the time complexity is O(n^2)
 */

public class SelectionSort {

    public static void main(String[] args) {
        int A[] = {6, 7, 3, 8, 9, 0, 1, 44, 2};
        selectionSort(A);
        for (int num : A) {
            System.out.print(num + " ");
        }
    }

    /**
     * Swap elements of array
     *
     * @param A
     * @param i
     * @param j
     */
    public static void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    /**
     * Find index of minimal element
     *
     * @param A
     * @param start
     * @return
     */
    public static int findMinIndex(int A[], int start) {
        int minIndex = start;
        start++;

        while (start < A.length) {
            if (A[start] < A[minIndex]) {
                minIndex = start;
            }
            start++;
        }
        return minIndex;
    }

    /**
     * Every iteration we find minimal element of array and if it lesser than current element we swap them
     *
     * @param A
     */
    public static void selectionSort(int A[]) {
        for (int i = 0; i < A.length; i++) {
            int minIndex = findMinIndex(A, i);

            if (i != minIndex) {
                swap(A, i, minIndex);
            }
        }
    }
}
