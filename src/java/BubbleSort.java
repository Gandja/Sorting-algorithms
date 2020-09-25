/**
 * This is one of sorting algorithm and time complexity is O(n^2)
 */

public class BubbleSort {

    public static void main(String[] args) {
        int A[] = {7, 3, 11, 6, 2, 4, 10, 9, 8, 0, 5};
        bubbleSort(A, A.length);

        for (int num : A) {
            System.out.print(num + " ");
        }
    }

    /**
     * Swap neighbor elements if previous  greater than next
     *
     * @param A
     * @param size
     */
    public static void bubbleSort(int A[], int size) {
        for (int i = 0; i < size - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < size - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    swap(A, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
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
}
