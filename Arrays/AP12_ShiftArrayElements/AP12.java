package AP12_ShiftArrayElements;

/**
 * AP12
 */
public class AP12 {

    static void shiftElement(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        shiftElement(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}