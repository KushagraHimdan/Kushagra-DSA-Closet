package AP08_SwapAlternateElements;

/**
 * AP8
 */
public class AP8 {

    static void swapAlternateElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        swapAlternateElements(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}