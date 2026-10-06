package AP21_TwoSum;

import java.util.Arrays;

/**
 * AP21
 * return elements
 * Brute force
 */
public class AP21 {

    static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    int[] ans = { arr[i], arr[j] };
                    return ans;
                }
            }
        }
        int[] ans = {};
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 5, -6, 12, 4, 3 };
        int target = 10;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}