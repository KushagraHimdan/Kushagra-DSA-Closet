package AP22_ThreeSum;

import java.util.Arrays;

/**
 * AP22
 * return index
 * brute force
 */
public class AP22 {

    static int[] threeSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        int[] ans = { arr[i], arr[j], arr[k] };
                        return ans;
                    }
                }
            }
        }
        int[] ans = {};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, -3, 5, 10, -7, 9 };

        int target = 8;
        int[] result = threeSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}