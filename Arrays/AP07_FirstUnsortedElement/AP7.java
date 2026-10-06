package AP07_FirstUnsortedElement;

/**
 * AP7
 */
public class AP7 {

    static int getUnsortedElement(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1])
                return arr[i + 1];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 13, 9, 17 };
        int result = getUnsortedElement(arr);
        System.out.println("First Unsorted element : " + result);
    }
}