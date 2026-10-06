package AP10_AlternateExtremeElement;

/**
 * AP10
 */
public class AP10 {

    static void alternateExtremeElement(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            if (l == r) {
                System.out.print(arr[l] + " ");
                return;
            } else {
                System.out.print(arr[l] + " ");
                l++;
                System.out.print(arr[r] + " ");
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
       alternateExtremeElement(arr);

    }
}