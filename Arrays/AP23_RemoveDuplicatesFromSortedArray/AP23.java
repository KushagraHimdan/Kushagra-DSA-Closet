package AP23_RemoveDuplicatesFromSortedArray;

/**
 * AP22
 */
public class AP23 {

    static int removeDuplicatesfromSortedArray(int[] arr) {
        int i = 0;
        int j = i + 1;
        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
                j++;
            } else {
                j++;
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 3, 4, 5, 5, 6, 6, 6, 6, 7};
        int res = removeDuplicatesfromSortedArray(arr);
        System.out.println(res);
    }
}