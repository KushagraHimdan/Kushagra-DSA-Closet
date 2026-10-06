package AP17_SortZeroesOnes;

/**
 * AP17
 */
public class AP17 {

    static void sortZeroesOnes(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] == 1 && arr[end] == 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            if (arr[start] == 0)
                start++;
            if (arr[end] == 1)
                end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 1, 0, 0, 1, 1, 0 };
        sortZeroesOnes(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}